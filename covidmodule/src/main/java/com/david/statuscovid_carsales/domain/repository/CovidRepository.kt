package com.david.statuscovid_carsales.domain.repository

import com.david.statuscovid_carsales.data.model.StatusCovidData
import com.david.statuscovid_carsales.data.util.State

interface CovidRepository {
    suspend fun getStatusCovid(date: String): State<StatusCovidData>
}