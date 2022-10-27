package com.example.covidmodule.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lcom/example/covidmodule/presentation/viewmodel/CovidViewModel;", "Lcom/example/covidmodule/utils/BaseViewModel;", "getStatusCovidUseCase", "Lcom/example/covidmodule/domain/usecase/GetStatusCovidUseCase;", "(Lcom/example/covidmodule/domain/usecase/GetStatusCovidUseCase;)V", "_statusCovidLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/covidmodule/presentation/viewdata/StatusCovidViewData;", "_statusCovidStateLiveData", "Lcom/example/covidmodule/data/util/State;", "lastDateRequest", "Ljava/util/Date;", "getLastDateRequest", "()Ljava/util/Date;", "setLastDateRequest", "(Ljava/util/Date;)V", "statusCovidLiveData", "Landroidx/lifecycle/LiveData;", "getStatusCovidLiveData", "()Landroidx/lifecycle/LiveData;", "statusCovidStateLiveData", "getStatusCovidStateLiveData", "getStatusCovid", "Lkotlinx/coroutines/Job;", "date", "covidmodule_debug"})
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
    
    @javax.inject.Inject()
    public CovidViewModel(@org.jetbrains.annotations.NotNull()
    com.example.covidmodule.domain.usecase.GetStatusCovidUseCase getStatusCovidUseCase) {
        super();
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
}