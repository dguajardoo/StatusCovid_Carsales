package com.david.statuscovid_carsales.presentation.di

import com.david.statuscovid_carsales.data.repository.CovidRepositoryImpl
import com.david.statuscovid_carsales.data.repository.DataRemoteDataSource
import com.david.statuscovid_carsales.domain.repository.CovidRepository
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