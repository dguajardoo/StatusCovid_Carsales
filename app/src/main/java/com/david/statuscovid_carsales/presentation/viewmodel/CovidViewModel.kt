package com.david.statuscovid_carsales.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.domain.usecase.GetStatusCovidUseCase
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import com.david.statuscovid_carsales.utils.toLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CovidViewModel @Inject constructor(
    private val getStatusCovidUseCase: GetStatusCovidUseCase
) : ViewModel() {

    private val _statusCovidLiveData = MutableLiveData<State<StatusCovidViewData>>()
    val statusCovidLivedata = _statusCovidLiveData.toLiveData()

    fun getStatusCovid(date: String) = viewModelScope.launch(Dispatchers.IO) {
        getStatusCovidUseCase.execute(date).collect {
            _statusCovidLiveData.postValue(it)
        }
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