package com.david.statuscovid_carsales.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.david.statuscovid_carsales.data.api.CovidService
import com.david.statuscovid_carsales.data.model.StatusCovid
import com.david.statuscovid_carsales.data.util.Resource
import com.david.statuscovid_carsales.domain.usecase.GetStatusCovid
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CovidViewModel @Inject constructor(
    private val getStatusCovid: GetStatusCovid
): ViewModel() {

    val statusCovid: MutableLiveData<Resource<StatusCovid>?> = MutableLiveData()

    fun getStatusCovid(date: String) = viewModelScope.launch(Dispatchers.IO) {
        statusCovid.postValue(Resource.Loading())
        val result = getStatusCovid.execute(date)
        //emit(result)
        statusCovid.postValue(result)
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