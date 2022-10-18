package com.david.statuscovid_carsales.data.api

import com.david.statuscovid_carsales.data.model.StatusCovidData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ICovidService {
    @GET(TOTAL_REPORTS)
    suspend fun getCovidStatistics(
        @Query("date") date: String
    ): Response<StatusCovidData>
}