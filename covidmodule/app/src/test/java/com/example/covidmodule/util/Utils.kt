package com.example.covidmodule.util

import java.util.*

fun getCurrentDate(addDay: Int = 0): Date {
    val c = Calendar.getInstance()
    c.add(Calendar.DATE, addDay)
    return c.time
}