package com.david.statuscovid_carsales.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.domain.usecase.GetStatusCovidUseCase
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import com.david.statuscovid_carsales.utils.BaseViewModel
import com.david.statuscovid_carsales.utils.toLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CovidViewModel @Inject constructor(
    private val getStatusCovidUseCase: GetStatusCovidUseCase
) : BaseViewModel() {

    private val _statusCovidStateLiveData = MutableLiveData<State<StatusCovidViewData>>()
    val statusCovidStateLiveData = _statusCovidStateLiveData.toLiveData()

    private val _statusCovidLiveData = MutableLiveData<StatusCovidViewData?>()
    val statusCovidLiveData = _statusCovidLiveData.toLiveData()

    fun getStatusCovid(date: String) = manageView(
        getStatusCovidUseCase.execute(date),
        _statusCovidStateLiveData) {
            _statusCovidLiveData.postValue(it)
        }

    fun showDate() = liveData {
        var dt = Date()
        val c = Calendar.getInstance()
        c.time = dt
        c.add(Calendar.DATE, -1)
        dt = c.time

        emit(dt)
    }
}