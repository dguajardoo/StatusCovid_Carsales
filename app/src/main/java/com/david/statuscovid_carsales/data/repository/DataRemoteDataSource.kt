package com.david.statuscovid_carsales.data.repository

import com.david.statuscovid_carsales.data.model.Data
import com.david.statuscovid_carsales.data.model.StatusCovid
import retrofit2.Response

interface DataRemoteDataSource {
    suspend fun getStatusCovid(date: String): Response<StatusCovid>
}