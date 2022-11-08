package com.example.covidmodule.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JZ\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000f0\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00140\u0016J\u001c\u0010\u0017\u001a\u00020\u0014\"\u0004\b\u0000\u0010\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/example/covidmodule/utils/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "isContent", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "isError", "isLoading", "manageView", "Lkotlinx/coroutines/Job;", "V", "flow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/covidmodule/data/util/State;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "onLoading", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "updateView", "state", "covidmodule_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isContent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isError = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <V extends java.lang.Object>kotlinx.coroutines.Job manageView(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends com.example.covidmodule.data.util.State<V>> flow, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.covidmodule.data.util.State<V>> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super V, kotlin.Unit> onSuccess) {
        return null;
    }
    
    private final <V extends java.lang.Object>void updateView(com.example.covidmodule.data.util.State<V> state) {
    }
}