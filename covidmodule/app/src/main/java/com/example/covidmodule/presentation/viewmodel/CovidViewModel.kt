package com.example.covidmodule.presentation.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.covidmodule.data.util.State
import com.example.covidmodule.domain.usecase.GetStatusCovidUseCase
import com.example.covidmodule.presentation.di.DefaultDispatcher
import com.example.covidmodule.presentation.viewdata.StatusCovidViewData
import com.example.covidmodule.utils.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CovidViewModel @Inject constructor(
    private val getStatusCovidUseCase: GetStatusCovidUseCase,
    @DefaultDispatcher dispatcher: CoroutineDispatcher = Dispatchers.IO
    ) : BaseViewModel(dispatcher) {

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
            _statusCovidStateLiveData.postValue(State.Loading())
        },
        onSuccess = {
            _statusCovidLiveData.postValue(it)
        })


    // Events
    private val _eventsLiveData: MutableLiveData<RouterEvent<DashboardEvents>> = MutableLiveData()

    val eventsLiveData: LiveData<RouterEvent<DashboardEvents>> = _eventsLiveData

    fun observeEventsLiveData(
        lifecycleOwner: LifecycleOwner,
        eventObserver: EventObserver<DashboardEvents>
    ) {
        _eventsLiveData.observe(lifecycleOwner, eventObserver)
    }

    fun openCalendarDialog() {
        _eventsLiveData.postValue(RouterEvent(DashboardEvents.OpenCalendar))
    }
}