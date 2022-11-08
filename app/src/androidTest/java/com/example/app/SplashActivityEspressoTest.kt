package com.example.app

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.app.view.SplashActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.app.R as app

@RunWith(AndroidJUnit4::class)
@LargeTest
class SplashActivityEspressoTest {

    @Rule
    @JvmField
    var startActivityRule = ActivityScenarioRule(SplashActivity::class.java)

    @Test
    fun showImageSplash() {
        onView(withId(app.id.imageView_splash))
            .check(matches(isDisplayed()))
    }

}