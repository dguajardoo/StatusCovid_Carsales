package com.david.statuscovid_carsales.presentation.di

import com.david.statuscovid_carsales.domain.repository.CovidRepository
import com.david.statuscovid_carsales.domain.usecase.GetStatusCovid
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetStatusCovid(covidRepository: CovidRepository): GetStatusCovid {
        return GetStatusCovid(covidRepository)
    }
}