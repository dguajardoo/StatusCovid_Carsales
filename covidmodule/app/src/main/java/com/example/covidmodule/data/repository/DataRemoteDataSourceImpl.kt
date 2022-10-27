package com.example.covidmodule.data.repository

import com.example.covidmodule.data.api.ICovidService
import com.example.covidmodule.data.model.StatusCovidData
import retrofit2.Response

class DataRemoteDataSourceImpl(
    private val ICovidService: ICovidService
): DataRemoteDataSource {
    override suspend fun getStatusCovid(date: String): Response<StatusCovidData> {
        return ICovidService.getCovidStatistics(date)
    }

}