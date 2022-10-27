package com.example.app.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.App
import com.example.app.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    override fun onStart() {
        super.onStart()

        supportFragmentManager.beginTransaction().replace(
            R.id.fragmentContainer,
            App.serviceAppToRouter.getFragmentFromModuleCovid()
        ).commit()
    }
}