package com.example.covidmodule.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/covidmodule/domain/usecase/GetStatusCovidUseCase;", "", "ICovidService", "Lcom/example/covidmodule/data/api/ICovidService;", "statusCovidMapper", "Lcom/example/covidmodule/domain/mappers/StatusCovidMapper;", "(Lcom/example/covidmodule/data/api/ICovidService;Lcom/example/covidmodule/domain/mappers/StatusCovidMapper;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/covidmodule/data/util/State;", "Lcom/example/covidmodule/presentation/viewdata/StatusCovidViewData;", "date", "Ljava/util/Date;", "covidmodule_debug"})
public final class GetStatusCovidUseCase {
    private final com.example.covidmodule.data.api.ICovidService ICovidService = null;
    private final com.example.covidmodule.domain.mappers.StatusCovidMapper statusCovidMapper = null;
    
    @javax.inject.Inject()
    public GetStatusCovidUseCase(@org.jetbrains.annotations.NotNull()
    com.example.covidmodule.data.api.ICovidService ICovidService, @org.jetbrains.annotations.NotNull()
    com.example.covidmodule.domain.mappers.StatusCovidMapper statusCovidMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.covidmodule.data.util.State<com.example.covidmodule.presentation.viewdata.StatusCovidViewData>> execute(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
}