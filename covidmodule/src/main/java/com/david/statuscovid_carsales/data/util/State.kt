package com.david.statuscovid_carsales.data.util

sealed class State<T> {
    data class Success<T>(val data: T) : State<T>()
    class Loading<T> : State<T>()
    data class Error<T>(val message: String) : State<T>()
}