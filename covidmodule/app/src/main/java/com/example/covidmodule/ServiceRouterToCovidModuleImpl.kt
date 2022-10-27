package com.example.covidmodule

import androidx.fragment.app.Fragment
import com.example.covidmodule.presentation.CovidFragment

class ServiceRouterToCovidModuleImpl(): IServiceRouterToCovidModule {
    override fun getFragment(): Fragment {
        return CovidFragment()
    }
}