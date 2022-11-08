package com.example.covidmodule.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/covidmodule/data/repository/DataRemoteDataSourceImpl;", "Lcom/example/covidmodule/data/repository/DataRemoteDataSource;", "ICovidService", "Lcom/example/covidmodule/data/api/ICovidService;", "(Lcom/example/covidmodule/data/api/ICovidService;)V", "getStatusCovid", "Lretrofit2/Response;", "Lcom/example/covidmodule/data/model/StatusCovidData;", "date", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "covidmodule_debug"})
public final class DataRemoteDataSourceImpl implements com.example.covidmodule.data.repository.DataRemoteDataSource {
    private final com.example.covidmodule.data.api.ICovidService ICovidService = null;
    
    public DataRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.example.covidmodule.data.api.ICovidService ICovidService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStatusCovid(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.covidmodule.data.model.StatusCovidData>> continuation) {
        return null;
    }
}