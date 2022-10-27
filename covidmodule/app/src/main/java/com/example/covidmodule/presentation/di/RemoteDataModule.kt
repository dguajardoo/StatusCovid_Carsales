package com.example.covidmodule.presentation.di

import com.example.covidmodule.data.api.ICovidService
import com.example.covidmodule.data.repository.DataRemoteDataSource
import com.example.covidmodule.data.repository.DataRemoteDataSourceImpl
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
    fun providesDataRemoteDataSource(ICovidService: ICovidService): DataRemoteDataSource {
        return DataRemoteDataSourceImpl(ICovidService)
    }
}