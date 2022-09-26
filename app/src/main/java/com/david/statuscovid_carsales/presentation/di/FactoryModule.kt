package com.david.statuscovid_carsales.presentation.di

import com.david.statuscovid_carsales.domain.usecase.GetStatusCovid
import com.david.statuscovid_carsales.presentation.viewmodel.CovidViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideCovidViewModelFactory(getStatusCovid: GetStatusCovid): CovidViewModelFactory {
        return CovidViewModelFactory(getStatusCovid)
    }
}