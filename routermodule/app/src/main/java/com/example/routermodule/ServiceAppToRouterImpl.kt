package com.example.routermodule

import android.util.Log
import androidx.fragment.app.Fragment

class ServiceAppToRouterImpl(private val router: Router): IServiceAppToRouter {
    override fun getFragmentFromModuleCovid(): Fragment {
        Log.i("MY_TAG", "Router::ServiceAppToRouterImpl")
        return router.serviceRouterToCovidModule.getFragment()
    }

}