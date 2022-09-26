package com.david.statuscovid_carsales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.david.statuscovid_carsales.domain.usecase.GetStatusCovid

class CovidViewModelFactory(
    private val getStatusCovid: GetStatusCovid
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CovidViewModel(getStatusCovid) as T
    }
}