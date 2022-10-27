package com.example.covidmodule.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.covidmodule.data.util.State
import com.example.covidmodule.domain.usecase.GetStatusCovidUseCase
import com.example.covidmodule.presentation.viewdata.StatusCovidViewData
import com.example.covidmodule.utils.BaseViewModel
import com.example.covidmodule.utils.getCurrentDate
import com.example.covidmodule.utils.toLiveData
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

    var lastDateRequest: Date = getCurrentDate(-1)

    fun getStatusCovid(date: Date = getCurrentDate(-1)) = manageView(
        getStatusCovidUseCase.execute(date),
        _statusCovidStateLiveData,
        onLoading = {
            lastDateRequest = date
        },
        onSuccess = {
            _statusCovidLiveData.postValue(it)
        })
}