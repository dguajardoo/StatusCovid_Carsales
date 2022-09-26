package com.david.statuscovid_carsales.domain.repository

import com.david.statuscovid_carsales.data.model.Data
import com.david.statuscovid_carsales.data.model.StatusCovid
import com.david.statuscovid_carsales.data.util.Resource

interface CovidRepository {
    suspend fun getStatusCovid(date: String): Resource<StatusCovid>
}