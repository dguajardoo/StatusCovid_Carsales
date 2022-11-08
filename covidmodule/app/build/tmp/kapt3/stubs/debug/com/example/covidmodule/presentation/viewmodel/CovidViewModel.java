package com.example.covidmodule.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0014J\u001c\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%J\u0006\u0010&\u001a\u00020!R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/example/covidmodule/presentation/viewmodel/CovidViewModel;", "Lcom/example/covidmodule/utils/BaseViewModel;", "getStatusCovidUseCase", "Lcom/example/covidmodule/domain/usecase/GetStatusCovidUseCase;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/covidmodule/domain/usecase/GetStatusCovidUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_eventsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/covidmodule/utils/RouterEvent;", "Lcom/example/covidmodule/utils/DashboardEvents;", "_statusCovidLiveData", "Lcom/example/covidmodule/presentation/viewdata/StatusCovidViewData;", "_statusCovidStateLiveData", "Lcom/example/covidmodule/data/util/State;", "eventsLiveData", "Landroidx/lifecycle/LiveData;", "getEventsLiveData", "()Landroidx/lifecycle/LiveData;", "lastDateRequest", "Ljava/util/Date;", "getLastDateRequest", "()Ljava/util/Date;", "setLastDateRequest", "(Ljava/util/Date;)V", "statusCovidLiveData", "getStatusCovidLiveData", "statusCovidStateLiveData", "getStatusCovidStateLiveData", "getStatusCovid", "Lkotlinx/coroutines/Job;", "date", "observeEventsLiveData", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "eventObserver", "Lcom/example/covidmodule/utils/EventObserver;", "openCalendarDialog", "covidmodule_debug"})
public final class CovidViewModel extends com.example.covidmodule.utils.BaseViewModel {
    private final com.example.covidmodule.domain.usecase.GetStatusCovidUseCase getStatusCovidUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.covidmodule.data.util.State<com.example.covidmodule.presentation.viewdata.StatusCovidViewData>> _statusCovidStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.covidmodule.data.util.State<com.example.covidmodule.presentation.viewdata.StatusCovidViewData>> statusCovidStateLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.example.covidmodule.presentation.viewdata.StatusCovidViewData> _statusCovidLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.covidmodule.presentation.viewdata.StatusCovidViewData> statusCovidLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date lastDateRequest;
    private final androidx.lifecycle.MutableLiveData<com.example.covidmodule.utils.RouterEvent<com.example.covidmodule.utils.DashboardEvents>> _eventsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.covidmodule.utils.RouterEvent<com.example.covidmodule.utils.DashboardEvents>> eventsLiveData = null;
    
    @javax.inject.Inject()
    public CovidViewModel(@org.jetbrains.annotations.NotNull()
    com.example.covidmodule.domain.usecase.GetStatusCovidUseCase getStatusCovidUseCase, @org.jetbrains.annotations.NotNull()
    @com.example.covidmodule.presentation.di.DefaultDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.covidmodule.data.util.State<com.example.covidmodule.presentation.viewdata.StatusCovidViewData>> getStatusCovidStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.covidmodule.presentation.viewdata.StatusCovidViewData> getStatusCovidLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLastDateRequest() {
        return null;
    }
    
    public final void setLastDateRequest(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getStatusCovid(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.covidmodule.utils.RouterEvent<com.example.covidmodule.utils.DashboardEvents>> getEventsLiveData() {
        return null;
    }
    
    public final void observeEventsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    com.example.covidmodule.utils.EventObserver<com.example.covidmodule.utils.DashboardEvents> eventObserver) {
    }
    
    public final void openCalendarDialog() {
    }
}