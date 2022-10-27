package com.example.app.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.app.R

class SplashActivity : AppCompatActivity() {
    //private lateinit var mBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mBinding = ActivitySplashBinding.inflate(layoutInflater)
        //setContentView(mBinding.root)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

    }
}