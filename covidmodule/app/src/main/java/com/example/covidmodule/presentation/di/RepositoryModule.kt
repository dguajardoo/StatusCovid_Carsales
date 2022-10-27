package com.example.covidmodule.presentation.di

import com.example.covidmodule.data.repository.CovidRepositoryImpl
import com.example.covidmodule.data.repository.DataRemoteDataSource
import com.example.covidmodule.domain.repository.CovidRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideCovidRepository(dataRemoteDataSource: DataRemoteDataSource): CovidRepository {
        return CovidRepositoryImpl(dataRemoteDataSource)
    }
}