package com.david.statuscovid_carsales.data.repository

import com.david.statuscovid_carsales.data.api.ICovidService
import com.david.statuscovid_carsales.data.model.StatusCovidData
import retrofit2.Response

class DataRemoteDataSourceImpl(
    private val ICovidService: ICovidService
): DataRemoteDataSource {
    override suspend fun getStatusCovid(date: String): Response<StatusCovidData> {
        return ICovidService.getCovidStatistics(date)
    }

}