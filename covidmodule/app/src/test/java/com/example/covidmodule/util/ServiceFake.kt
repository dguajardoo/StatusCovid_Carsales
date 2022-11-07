package com.example.covidmodule.util

import com.example.covidmodule.data.api.ICovidService
import com.example.covidmodule.data.model.StatusCovidData
import okhttp3.ResponseBody.Companion.toResponseBody
import retrofit2.Response

class ServiceFake(private val errorForce: Boolean = true) : ICovidService {
    override suspend fun getCovidStatistics(date: String): Response<StatusCovidData> {
        return if (errorForce)
            Response.error(500, byteArrayOf().toResponseBody(null))
        else
            Response.success(StatusCovidData())
    }
}