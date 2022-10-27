package com.example.covidmodule.data.model


import com.google.gson.annotations.SerializedName

data class StatusCovidData(
    @SerializedName("data") val dataCovid: InfoData? = null
)