package com.david.statuscovid_carsales.data.repository

import com.david.statuscovid_carsales.data.model.StatusCovidData
import retrofit2.Response

interface DataRemoteDataSource {
    suspend fun getStatusCovid(date: String): Response<StatusCovidData>
}