package com.david.statuscovid_carsales.domain.usecase

import com.david.statuscovid_carsales.data.model.Data
import com.david.statuscovid_carsales.data.model.StatusCovid
import com.david.statuscovid_carsales.data.util.Resource
import com.david.statuscovid_carsales.domain.repository.CovidRepository

class GetStatusCovid(private val covidRepository: CovidRepository) {
    suspend fun execute(date: String): Resource<StatusCovid>? = covidRepository.getStatusCovid(date)
}