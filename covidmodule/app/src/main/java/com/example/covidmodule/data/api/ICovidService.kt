package com.example.covidmodule.data.api

import com.example.covidmodule.data.model.StatusCovidData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ICovidService {
    @GET(TOTAL_REPORTS)
    suspend fun getCovidStatistics(
        @Query("date") date: String
    ): Response<StatusCovidData>
}