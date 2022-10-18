package com.david.statuscovid_carsales.data.model


import com.google.gson.annotations.SerializedName

data class StatusCovidData(
    @SerializedName("data") val dataCovid: InfoData? = null
)