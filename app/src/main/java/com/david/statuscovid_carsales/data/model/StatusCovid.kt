package com.david.statuscovid_carsales.data.model


import com.david.statuscovid_carsales.data.model.Data
import com.google.gson.annotations.SerializedName

data class StatusCovid(
    @SerializedName("data")
    val `data`: Data
)