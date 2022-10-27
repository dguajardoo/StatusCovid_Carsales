package com.example.covidmodule.utils.presentation

import android.app.DatePickerDialog
import android.content.Context
import com.example.covidmodule.utils.YYYY_MM_DD_WITH_SCRIPT
import com.example.covidmodule.utils.toDateFormat
import java.util.*

class CalendarManager {
    companion object {
        private val calendar = Calendar.getInstance()
        private var year: Int = 0
        private var month: Int = 0
        private var day: Int = 0

        fun showPickerDialog(context: Context, onSuccess: (String) -> Unit ) {
            calendarInstance()
            pickerInstance(context, onSuccess)
        }

        private fun calendarInstance() {
            year = calendar.get(Calendar.YEAR)
            month = calendar.get(Calendar.MONTH)
            day = calendar.get(Calendar.DAY_OF_MONTH)
        }

        private fun pickerInstance(context: Context, onSuccess: (String) -> Unit) {
            val dpd = DatePickerDialog(
                context,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                    var date = dateFormatToString(year, monthOfYear, dayOfMonth)
                    onSuccess(date)
                },
                year,
                month,
                day
            )

            dpd.datePicker.maxDate = getDateTime()
            dpd.show()
        }

        private fun dateFormatToString(year: Int, monthOfYear: Int, dayOfMonth: Int): String {
            val cal = Calendar.getInstance()
            cal.set(year, monthOfYear, dayOfMonth)
            return cal.toDateFormat(YYYY_MM_DD_WITH_SCRIPT)
        }

        private fun getDateTime(): Long {
            var dt = Date()
            dt = Companion.calendar.time
            return dt.time
        }
    }



}