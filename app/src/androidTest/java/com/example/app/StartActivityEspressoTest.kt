package com.example.app

import android.content.res.Resources
import android.widget.DatePicker
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.PickerActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import com.example.app.utils.getCurrentDate
import com.example.app.utils.toFormat
import com.example.app.view.StartActivity
import org.hamcrest.CoreMatchers.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.covidmodule.R as covid

@RunWith(AndroidJUnit4::class)
@LargeTest
class StartActivityEspressoTest {

    @Rule
    @JvmField
    var startActivityRule = ActivityScenarioRule(StartActivity::class.java)

    private lateinit var resources: Resources

    @Before
    fun setUp() {
        resources = InstrumentationRegistry.getInstrumentation().targetContext.resources
    }


    @Test
    fun validateLoading() {
        onView(withId(covid.id.progressBar)).check(matches(isDisplayed()))
    }

    @Test
    fun validateTextViews() {
        Thread.sleep(2000)

        var textViewDate = onView(withId(covid.id.tv_date))
        var textViewConfirmed = onView(withId(covid.id.tv_confirmed))
        var textViewDeaths = onView(withId(covid.id.tv_deaths))

        textViewDate.check(matches(isDisplayed()))
        textViewConfirmed.check(matches(isDisplayed()))
        textViewDeaths.check(matches(isDisplayed()))

        textViewDate.check(matches(withText(getCurrentDate(-1).toFormat("dd MMM yyyy"))))
        textViewConfirmed.check(matches(withText(containsString(resources.getString(covid.string.confirmed_cases)))))
        textViewDeaths.check(matches(withText(containsString(resources.getString(covid.string.number_of_deceased_people)))))

    }

    private fun showCalendar(year: Int, month: Int, day: Int) {
        var button = onView(withId(covid.id.btn_date))
        button.check(matches(isDisplayed()))
        button.perform(click())
        onView(isAssignableFrom(DatePicker::class.java)).perform(
            PickerActions.setDate(
                year, month, day
            )
        )
    }

    @Test
    fun openCalendar() {
        Thread.sleep(2000)
        showCalendar(2022, 11, 1)
    }

    @Test
    fun selectDateOnCalendar() {
        Thread.sleep(2000)
        showCalendar(2022, 11, 1)
        onView(withId(android.R.id.button1)).perform(click())

        onView(withId(covid.id.progressBar)).check(matches(isDisplayed()))
        Thread.sleep(2000)
    }

    @Test
    fun errorOnCalendar() {
        Thread.sleep(2000)
        showCalendar(2022, 12, 31)
        onView(withId(android.R.id.button1)).perform(click());
        Thread.sleep(2000)
        onView(withId(covid.id.errorView)).check(matches(isDisplayed()))
        Thread.sleep(2000)
    }
}