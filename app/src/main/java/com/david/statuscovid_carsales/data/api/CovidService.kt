package com.david.statuscovid_carsales.data.api

import com.david.statuscovid_carsales.data.model.Data
import com.david.statuscovid_carsales.data.model.StatusCovid
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CovidService {
    @GET("reports/total")
    suspend fun getCovidStatistics(
        @Query("date") date: String
    ): Response<StatusCovid>
}