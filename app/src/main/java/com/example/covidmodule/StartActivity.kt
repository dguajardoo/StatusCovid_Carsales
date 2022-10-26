package com.example.covidmodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.routermodule.Router
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    override fun onStart() {
        super.onStart()

        supportFragmentManager.beginTransaction().add(
            R.id.fragmentContainer,
            App.serviceAppToRouter.getFragmentFromModuleCovid()
        ).commit()
    }
}