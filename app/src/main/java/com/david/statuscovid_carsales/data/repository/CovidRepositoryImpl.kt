package com.david.statuscovid_carsales.data.repository

import android.util.Log
import com.david.statuscovid_carsales.data.model.Data
import com.david.statuscovid_carsales.data.model.StatusCovid
import com.david.statuscovid_carsales.data.util.Resource
import com.david.statuscovid_carsales.domain.repository.CovidRepository

class CovidRepositoryImpl(
    private val dataRemoteDataSource: DataRemoteDataSource
): CovidRepository {
    override suspend fun getStatusCovid(date: String): Resource<StatusCovid> {
        return getStatusCovidFromAPI(date)
    }

    suspend fun getStatusCovidFromAPI(date: String): Resource<StatusCovid> {
        lateinit var statusCovid: StatusCovid
        try {
            val response = dataRemoteDataSource.getStatusCovid(date)
            val body = response.body()
            if (body != null) {
                statusCovid = body
            }
        } catch (ex: Exception) {
            Log.i("MyTag", ex.message.toString())
        }
        return Resource.Success(statusCovid)
    }

}