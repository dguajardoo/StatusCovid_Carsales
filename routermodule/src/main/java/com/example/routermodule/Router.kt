package com.example.routermodule

import com.david.statuscovid_carsales.IServiceRouterToCovidModule
import com.david.statuscovid_carsales.ServiceRouterToCovidModuleImpl

class Router {
    val serviceAppToRouter: IServiceAppToRouter = ServiceAppToRouterImpl(this)

    internal val serviceRouterToCovidModule: IServiceRouterToCovidModule = ServiceRouterToCovidModuleImpl()
}