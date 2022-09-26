package com.david.statuscovid_carsales.presentation.di

import com.david.statuscovid_carsales.data.api.CovidService
import com.david.statuscovid_carsales.data.repository.DataRemoteDataSource
import com.david.statuscovid_carsales.data.repository.DataRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {
    @Singleton
    @Provides
    fun providesDataRemoteDataSource(covidService: CovidService): DataRemoteDataSource {
        return DataRemoteDataSourceImpl(covidService)
    }
}