package com.david.statuscovid_carsales.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.david.statuscovid_carsales.R
import com.david.statuscovid_carsales.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    //private lateinit var mBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mBinding = ActivitySplashBinding.inflate(layoutInflater)
        //setContentView(mBinding.root)
        setContentView(R.layout.activity_splash)
        /*
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

         */
    }
}