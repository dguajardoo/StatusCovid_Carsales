package com.example.covidmodule.domain.mappers

import com.example.covidmodule.data.model.StatusCovidData
import com.example.covidmodule.data.util.IMapper
import com.example.covidmodule.presentation.viewdata.StatusCovidViewData
import com.example.covidmodule.utils.orZero
import javax.inject.Inject

class StatusCovidMapper @Inject constructor() : IMapper<StatusCovidData, StatusCovidViewData> {
    override fun execute(statusCovidData: StatusCovidData?) = statusCovidData?.dataCovid?.let {
        StatusCovidViewData(it.confirmed.orZero().toString(), it.deaths.orZero().toString())
    } ?: StatusCovidViewData()
}