package com.david.statuscovid_carsales.data.util

interface IMapper<D,V> {
    fun execute(data: D?): V
}