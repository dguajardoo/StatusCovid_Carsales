package com.david.statuscovid_carsales.domain.mappers

import com.david.statuscovid_carsales.data.model.StatusCovidData
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import com.david.statuscovid_carsales.utils.orZero
import javax.inject.Inject

class StatusCovidMapper @Inject constructor() {
    fun execute(statusCovidData: StatusCovidData?) = statusCovidData?.dataCovid?.let {
        StatusCovidViewData(it.confirmed.orZero(), it.deaths.orZero())
    } ?: StatusCovidViewData(0, 0)
}