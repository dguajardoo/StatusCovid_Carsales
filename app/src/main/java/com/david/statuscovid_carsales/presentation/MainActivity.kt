package com.david.statuscovid_carsales.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.david.statuscovid_carsales.R
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.databinding.ActivityMainBinding
import com.david.statuscovid_carsales.presentation.viewmodel.CovidViewModel
import com.david.statuscovid_carsales.utils.*
import com.david.statuscovid_carsales.utils.presentation.CalendarManager
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: CovidViewModel by viewModels()
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this

        initListener()
        initObserver()
        displayFormatDate()

        viewModel.getStatusCovid()
    }

    private fun initCalendar() {
        CalendarManager.showPickerDialog(this) {
            displayFormatDate(it)
            viewModel.getStatusCovid(it.toDateFormat(YYYY_MM_DD_WITH_SCRIPT))
        }
    }

    private fun initObserver() {
        viewModel.statusCovidStateLiveData.observe(this) {
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

    private fun displayFormatDate(stringDate: String = getCurrentDate(-1).toFormat(DD_MMM_YYYY_WITH_SPACE)) {
        mBinding.tvDate.text = stringDate
    }
}