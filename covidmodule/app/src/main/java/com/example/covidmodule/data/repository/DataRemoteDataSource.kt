package com.example.covidmodule.data.repository

import com.example.covidmodule.data.model.StatusCovidData
import retrofit2.Response

interface DataRemoteDataSource {
    suspend fun getStatusCovid(date: String): Response<StatusCovidData>
}