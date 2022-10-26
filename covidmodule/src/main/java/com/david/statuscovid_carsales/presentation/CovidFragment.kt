package com.david.statuscovid_carsales.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.david.statuscovid_carsales.R
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.databinding.FragmentCovidBinding
import com.david.statuscovid_carsales.presentation.viewmodel.CovidViewModel
import com.david.statuscovid_carsales.utils.*
import com.david.statuscovid_carsales.utils.presentation.CalendarManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CovidFragment : Fragment() {
    private val viewModel: CovidViewModel by viewModels()
    private lateinit var mBinding: FragmentCovidBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_covid, container, false)
        //mBinding = FragmentCovidBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this
        Log.i("MY_TAG", "CovidModule::CovidFragment")
        initListener()
        initObserver()
        displayFormatDate()

        viewModel.getStatusCovid()
    }



    private fun initCalendar() {
        CalendarManager.showPickerDialog(this.requireContext()) {
            displayFormatDate(it)
            viewModel.getStatusCovid(it.toDateFormat(YYYY_MM_DD_WITH_SCRIPT))
        }
    }

    private fun initObserver() {
        viewModel.statusCovidStateLiveData.observe(this.viewLifecycleOwner) {
            if (it is State.Error) {
                mBinding.errorView.show("${getString(R.string.error_message)} ${it.message}") {
                    viewModel.getStatusCovid(viewModel.lastDateRequest)
                }
            }
        }
    }

    private fun initListener() {
        mBinding.btnDate.setOnClickListener {
            initCalendar()
        }
    }

    private fun displayFormatDate(stringDate: String = getCurrentDate(-1).toFormat(
        DD_MMM_YYYY_WITH_SPACE
    )) {
        mBinding.tvDate.text = stringDate
    }
}