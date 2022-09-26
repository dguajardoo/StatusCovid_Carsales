package com.david.statuscovid_carsales.data.repository

import com.david.statuscovid_carsales.data.model.Data
import com.david.statuscovid_carsales.data.api.CovidService
import com.david.statuscovid_carsales.data.model.StatusCovid
import retrofit2.Response

class DataRemoteDataSourceImpl(
    private val covidService: CovidService
): DataRemoteDataSource {
    override suspend fun getStatusCovid(date: String): Response<StatusCovid> {
        return covidService.getCovidStatistics(date)
    }

}