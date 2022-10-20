package com.david.statuscovid_carsales.utils

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

fun getCurrentDate(addDay: Int = 0): Date {
    val c = Calendar.getInstance()
    c.add(Calendar.DATE, addDay)
    return c.time
}

fun Date.toFormat(format: String): String {
    var sdf = SimpleDateFormat(format)
    return sdf.format(this)
}

fun String.toDateFormat(format: String): Date = SimpleDateFormat(format).parse(this)

fun Calendar.toDateFormat(format: String): String = SimpleDateFormat(format).format(this.time)
