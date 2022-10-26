package com.david.statuscovid_carsales

import androidx.fragment.app.Fragment
import com.david.statuscovid_carsales.presentation.BlankFragment
import com.david.statuscovid_carsales.presentation.CovidFragment

class ServiceRouterToCovidModuleImpl(): IServiceRouterToCovidModule {
    override fun getFragment(): Fragment {
        return BlankFragment() //CovidFragment()
    }
}