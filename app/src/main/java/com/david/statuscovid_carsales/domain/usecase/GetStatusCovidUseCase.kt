package com.david.statuscovid_carsales.domain.usecase

import com.david.statuscovid_carsales.data.api.ICovidService
import com.david.statuscovid_carsales.data.util.State
import com.david.statuscovid_carsales.domain.mappers.StatusCovidMapper
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import com.david.statuscovid_carsales.utils.data.requestWithMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetStatusCovidUseCase @Inject constructor(
    private val ICovidService: ICovidService, private val statusCovidMapper: StatusCovidMapper
) {
    fun execute(date: String): Flow<State<StatusCovidViewData>> = flow {
        emit(State.Loading())
        val covidResult =
            requestWithMapper(statusCovidMapper) { ICovidService.getCovidStatistics(date) }
        emit(covidResult)
    }
}