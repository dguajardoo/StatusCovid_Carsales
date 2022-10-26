package com.example.covidmodule

import android.app.Application
import com.example.routermodule.IServiceAppToRouter
import com.example.routermodule.Router
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App: Application() {
    override fun onCreate() {
        super.onCreate()
        //serviceAppToRouter = Router().serviceAppToRouter
    }

    companion object {
        lateinit var serviceAppToRouter: IServiceAppToRouter
    }
}