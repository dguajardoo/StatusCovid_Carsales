package com.example.covidmodule.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/covidmodule/data/repository/CovidRepositoryImpl;", "Lcom/example/covidmodule/domain/repository/CovidRepository;", "dataRemoteDataSource", "Lcom/example/covidmodule/data/repository/DataRemoteDataSource;", "(Lcom/example/covidmodule/data/repository/DataRemoteDataSource;)V", "getStatusCovid", "Lcom/example/covidmodule/data/util/State;", "Lcom/example/covidmodule/data/model/StatusCovidData;", "date", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatusCovidFromAPI", "covidmodule_debug"})
public final class CovidRepositoryImpl implements com.example.covidmodule.domain.repository.CovidRepository {
    private final com.example.covidmodule.data.repository.DataRemoteDataSource dataRemoteDataSource = null;
    
    public CovidRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.covidmodule.data.repository.DataRemoteDataSource dataRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStatusCovid(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.covidmodule.data.util.State<com.example.covidmodule.data.model.StatusCovidData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStatusCovidFromAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.covidmodule.data.util.State<com.example.covidmodule.data.model.StatusCovidData>> continuation) {
        return null;
    }
}