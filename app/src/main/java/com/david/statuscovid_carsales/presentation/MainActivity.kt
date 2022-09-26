package com.david.statuscovid_carsales.presentation

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.david.statuscovid_carsales.R
import com.david.statuscovid_carsales.data.util.Resource
import com.david.statuscovid_carsales.databinding.ActivityMainBinding
import com.david.statuscovid_carsales.presentation.viewmodel.CovidViewModel
import com.david.statuscovid_carsales.presentation.viewmodel.CovidViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: CovidViewModelFactory
    lateinit var viewModel: CovidViewModel
    private lateinit var mBinding: ActivityMainBinding

    private lateinit var mDate: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        viewModel = ViewModelProvider(this, factory).get(CovidViewModel::class.java)

        showDate()
        showCalendar()
    }

    private fun initCalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)




        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

            var monthString = (monthOfYear+1).toString();
            if (monthString.length == 1) {
                monthString = "0$monthString"
            }
            mDate = "$year-$monthString-${dayOfMonth-1}"
            loadData()

        }, year, month, day)
        var dt = Date()
        dt = c.time
        dpd.datePicker.maxDate = dt.time
        dpd.show()
    }

    private fun loadData() {
        viewModel.getStatusCovid(mDate)
        viewModel.statusCovid.observe(this) {response ->
            when (response) {
                is Resource.Success -> {
                    hideLoading()
                    mBinding.tvConfirmed.text =  "${getString(R.string.confirmed_cases)} ${response?.data?.data?.confirmed.toString()}"
                    mBinding.tvDeaths.text = "${getString(R.string.number_of_deceased_people)} ${response?.data?.data?.deaths.toString()}"
                }
                is Resource.Loading -> {
                    showLoading()
                }
                is Resource.Error -> {
                    hideLoading()
                    response.message?.let {
                        Toast.makeText(this, "An error ocurred : $it", Toast.LENGTH_LONG).show()
                    }
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

    private fun showLoading() {
        mBinding.linearLayout.visibility = View.VISIBLE
        mBinding.btnDate.visibility = View.GONE
    }

    private fun hideLoading() {
        mBinding.linearLayout.visibility = View.GONE
        mBinding.btnDate.visibility = View.VISIBLE
    }
}