package com.example.covidmodule.domain.repository

import com.example.covidmodule.data.model.StatusCovidData
import com.example.covidmodule.data.util.State

interface CovidRepository {
    suspend fun getStatusCovid(date: String): State<StatusCovidData>
}