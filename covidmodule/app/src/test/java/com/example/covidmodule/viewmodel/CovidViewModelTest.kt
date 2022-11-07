package com.example.covidmodule.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.covidmodule.data.util.State
import com.example.covidmodule.domain.mappers.StatusCovidMapper
import com.example.covidmodule.domain.usecase.GetStatusCovidUseCase
import com.example.covidmodule.presentation.viewdata.StatusCovidViewData
import com.example.covidmodule.presentation.viewmodel.CovidViewModel
import com.example.covidmodule.util.ServiceFake
import com.example.covidmodule.util.getCurrentDate
import com.example.covidmodule.utils.DashboardEvents
import com.example.covidmodule.utils.EventObserver
import com.example.covidmodule.utils.RouterEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.resetMain
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.refEq
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

@RunWith(JUnit4::class)
class CovidViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    private lateinit var covidViewModel: CovidViewModel

    @Mock
    lateinit var getStatusCovidUseCase: GetStatusCovidUseCase

    @Mock
    lateinit var covidLiveDataObserver: Observer<State<StatusCovidViewData>>

    @Mock
    lateinit var dashboardEventObserver: EventObserver<DashboardEvents>

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @After
    fun onAfter() {
        Dispatchers.resetMain()
    }

    @Test
    fun loadingTest() = rule.run {

        covidViewModel = CovidViewModel(
            GetStatusCovidUseCase(ServiceFake(false), StatusCovidMapper()),
            Dispatchers.Unconfined
        ).apply {
            statusCovidStateLiveData.observeForever(covidLiveDataObserver)
        }

        whenever(getStatusCovidUseCase.execute(getCurrentDate(-10))).thenReturn(
            flowOf(State.Loading())
        )

        covidViewModel.getStatusCovid(getCurrentDate())
        verify(covidLiveDataObserver, times(2)).onChanged(refEq(State.Loading()))
    }

    @Test
    fun successTest() = rule.run {

        covidViewModel = CovidViewModel(
            GetStatusCovidUseCase(ServiceFake(false), StatusCovidMapper()),
            Dispatchers.Unconfined
        ).apply {
            statusCovidStateLiveData.observeForever(covidLiveDataObserver)
        }

        var viewData = StatusCovidViewData()

        whenever(getStatusCovidUseCase.execute(getCurrentDate(-10))).thenReturn(
            flowOf(State.Success(viewData))
        )

        covidViewModel.getStatusCovid(getCurrentDate())
        verify(covidLiveDataObserver).onChanged(refEq(State.Success(viewData)))

        Assert.assertEquals(State.Success(viewData), covidViewModel.statusCovidStateLiveData.value)
    }

    @Test
    fun errorTest() = rule.run {

        covidViewModel = CovidViewModel(
            GetStatusCovidUseCase(ServiceFake(), StatusCovidMapper()),
            Dispatchers.Unconfined
        ).apply {
            statusCovidStateLiveData.observeForever(covidLiveDataObserver)
        }

        whenever(getStatusCovidUseCase.execute(getCurrentDate(10))).thenAnswer {
            State.Error<StatusCovidViewData>("Response.error()")
        }

        covidViewModel.getStatusCovid(getCurrentDate())
        verify(covidLiveDataObserver).onChanged(refEq(State.Error("Response.error()")))

        Assert.assertEquals(
            State.Error<State<StatusCovidViewData>>("Response.error()"),
            covidViewModel.statusCovidStateLiveData.value
        )
    }

    @Test
    fun should_openCalendarDialog_when_PressButton() {
        covidViewModel = CovidViewModel(
            GetStatusCovidUseCase(ServiceFake(), StatusCovidMapper()),
            Dispatchers.Unconfined
        ).apply {
            statusCovidStateLiveData.observeForever(covidLiveDataObserver)
            eventsLiveData.observeForever(dashboardEventObserver)
        }

        covidViewModel.openCalendarDialog()
        verify(dashboardEventObserver).onChanged(
            refEq(RouterEvent(DashboardEvents.OpenCalendar))
        )
    }
}