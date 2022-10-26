package com.david.statuscovid_carsales.domain.usecase

import com.david.statuscovid_carsales.data.api.ICovidService
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.domain.mappers.StatusCovidMapper
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import com.david.statuscovid_carsales.utils.YYYY_MM_DD_WITH_SCRIPT
import com.david.statuscovid_carsales.utils.data.requestWithMapper
import com.david.statuscovid_carsales.utils.toFormat
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.*
import javax.inject.Inject

class GetStatusCovidUseCase @Inject constructor(
    private val ICovidService: ICovidService, private val statusCovidMapper: StatusCovidMapper
) {
    fun execute(date: Date): Flow<State<StatusCovidViewData>> = flow {
        emit(State.Loading())
        val formatRequired = date.toFormat(YYYY_MM_DD_WITH_SCRIPT)
        val covidResult =
            requestWithMapper(statusCovidMapper) { ICovidService.getCovidStatistics(formatRequired) }
        emit(covidResult)
    }
}