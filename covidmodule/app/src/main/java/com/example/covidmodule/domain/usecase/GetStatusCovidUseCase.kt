package com.example.covidmodule.domain.usecase

import com.example.covidmodule.data.api.ICovidService
import com.example.covidmodule.data.util.State
import com.example.covidmodule.domain.mappers.StatusCovidMapper
import com.example.covidmodule.presentation.viewdata.StatusCovidViewData
import com.example.covidmodule.utils.YYYY_MM_DD_WITH_SCRIPT
import com.example.covidmodule.utils.data.requestWithMapper
import com.example.covidmodule.utils.toFormat
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