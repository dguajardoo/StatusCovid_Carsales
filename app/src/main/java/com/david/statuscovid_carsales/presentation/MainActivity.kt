package com.david.statuscovid_carsales.presentation

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.databinding.ActivityMainBinding
import com.david.statuscovid_carsales.presentation.viewmodel.CovidViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: CovidViewModel by viewModels()
    private lateinit var mBinding: ActivityMainBinding

    private lateinit var mDate: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        showDate()
        showCalendar()
    }

    override fun onStart() {
        super.onStart()
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this
    }

    private fun initCalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                var monthString = (monthOfYear + 1).toString();
                if (monthString.length == 1) {
                    monthString = "0$monthString"
                }
                mDate = "$year-$monthString-${dayOfMonth - 1}"
                loadData()

            },
            year,
            month,
            day
        )
        var dt = Date()
        dt = c.time
        dpd.datePicker.maxDate = dt.time
        dpd.show()
    }

    private fun loadData() {
        viewModel.getStatusCovid(mDate)
        viewModel.statusCovidStateLiveData.observe(this) {
            if (it is State.Error) {
                mBinding.errorView.show("An error ocurred : ${it.message}") {
                    loadData()
                }
            }
        }
    }

    private fun showCalendar() {
        mBinding.btnDate.setOnClickListener {
            initCalendar()
        }
    }

    private fun showDate() {
        val dateLiveData = viewModel.showDate()
        dateLiveData.observe(this) {
            var sdf = SimpleDateFormat("dd MMM yyyy")
            var currentDate = sdf.format(it)
            mBinding.tvDate.text = currentDate

            sdf = SimpleDateFormat("yyyy-MM-dd")
            currentDate = sdf.format(it)
            mDate = currentDate

            loadData()
        }
    }
}