package com.example.covidmodule.util

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineScope
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.rules.TestWatcher
import org.junit.runner.Description

@ExperimentalCoroutinesApi
class MainCoroutineRule : TestWatcher(),
    TestCoroutineScope by TestCoroutineScope() {

    override fun starting(description: Description) {
        super.starting(description)
        Dispatchers.setMain(
            Dispatchers.Unconfined
        )
    }

    override fun finished(description: Description) {
        super.finished(description)
        Dispatchers.resetMain()
    }
}