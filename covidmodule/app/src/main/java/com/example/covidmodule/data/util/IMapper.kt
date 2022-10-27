package com.example.covidmodule.data.util

interface IMapper<D,V> {
    fun execute(data: D?): V
}