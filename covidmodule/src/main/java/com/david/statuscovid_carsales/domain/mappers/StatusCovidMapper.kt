package com.david.statuscovid_carsales.domain.mappers

import com.david.statuscovid_carsales.data.model.StatusCovidData
import com.david.statuscovid_carsales.data.util.IMapper
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import com.david.statuscovid_carsales.utils.orZero
import javax.inject.Inject

class StatusCovidMapper @Inject constructor() : IMapper<StatusCovidData, StatusCovidViewData> {
    override fun execute(statusCovidData: StatusCovidData?) = statusCovidData?.dataCovid?.let {
        StatusCovidViewData(it.confirmed.orZero().toString(), it.deaths.orZero().toString())
    } ?: StatusCovidViewData()
}