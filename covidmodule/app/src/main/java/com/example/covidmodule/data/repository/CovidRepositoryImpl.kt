package com.example.covidmodule.data.repository

import android.util.Log
import com.example.covidmodule.data.model.StatusCovidData
import com.example.covidmodule.data.util.State
import com.example.covidmodule.domain.repository.CovidRepository

class CovidRepositoryImpl(
    private val dataRemoteDataSource: DataRemoteDataSource
): CovidRepository {
    override suspend fun getStatusCovid(date: String): State<StatusCovidData> {
        return getStatusCovidFromAPI(date)
    }

    suspend fun getStatusCovidFromAPI(date: String): State<StatusCovidData> {
        lateinit var statusCovid: StatusCovidData
        try {
            val response = dataRemoteDataSource.getStatusCovid(date)
            val body = response.body()
            if (body != null) {
                statusCovid = body
            }
        } catch (ex: Exception) {
            Log.i("MyTag", ex.message.toString())
        }
        return State.Success(statusCovid)
    }

}