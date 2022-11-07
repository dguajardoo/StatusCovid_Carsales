package com.example.covidmodule.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.covidmodule.R
import com.example.covidmodule.data.util.State
import com.example.covidmodule.databinding.FragmentCovidBinding
import com.example.covidmodule.presentation.viewdata.StatusCovidViewData
import com.example.covidmodule.presentation.viewmodel.CovidViewModel
import com.example.covidmodule.utils.*
import com.example.covidmodule.utils.presentation.CalendarManager
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
        mBinding = FragmentCovidBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //mBinding.viewModel = viewModel
        //mBinding.lifecycleOwner = this
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
            contentVisibility(it)
            if (it is State.Error) {
                mBinding.errorView.show("${getString(R.string.error_message)} ${it.message}") {
                    viewModel.getStatusCovid(viewModel.lastDateRequest)
                }
            }
            if (it is State.Success) {
                mBinding.tvConfirmed.text =
                    "${getString(R.string.confirmed_cases)} ${it.data.confirmed}"
                mBinding.tvDeaths.text =
                    "${getString(R.string.number_of_deceased_people)} ${it.data.deaths}"
            }
        }

        viewModel.observeEventsLiveData(viewLifecycleOwner, EventObserver {
            when(it) {
                DashboardEvents.OpenCalendar -> initCalendar()
            }
        })
    }

    private fun initListener() {
        mBinding.btnDate.setOnClickListener {
            viewModel.openCalendarDialog()
        }
    }

    private fun displayFormatDate(
        stringDate: String = getCurrentDate(-1).toFormat(
            DD_MMM_YYYY_WITH_SPACE
        )
    ) {
        mBinding.tvDate.text = stringDate
    }

    private fun contentVisibility(state: State<StatusCovidViewData>) {
        mBinding.contentView.visibility = if (state is State.Success) View.VISIBLE else View.GONE
        mBinding.progressBar.visibility = if (state is State.Loading) View.VISIBLE else View.GONE
        mBinding.errorView.visibility = if (state is State.Error) View.VISIBLE else View.GONE
    }

}