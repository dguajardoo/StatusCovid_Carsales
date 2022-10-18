package com.david.statuscovid_carsales.domain.usecase

import com.david.statuscovid_carsales.data.api.ICovidService
import com.david.statuscovid_carsales.data.util.Resource
import com.david.statuscovid_carsales.domain.mappers.StatusCovidMapper
import com.david.statuscovid_carsales.presentation.viewdata.StatusCovidViewData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetStatusCovidUseCase @Inject constructor(
    private val ICovidService: ICovidService,
    private val statusCovidMapper: StatusCovidMapper
) {
    fun execute(date: String): Flow<Resource<StatusCovidViewData>> = flow {
        emit(Resource.Loading())
        val covidResult = ICovidService.getCovidStatistics(date)
        if (covidResult.isSuccessful) {
            val viewData = statusCovidMapper.execute(covidResult.body())
            emit(Resource.Success(viewData))
        } else {
            emit(Resource.Error(covidResult.message()))
        }
    }
}