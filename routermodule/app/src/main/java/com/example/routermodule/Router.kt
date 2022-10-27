package com.example.routermodule

import com.example.covidmodule.IServiceRouterToCovidModule
import com.example.covidmodule.ServiceRouterToCovidModuleImpl

class Router {
    val serviceAppToRouter: IServiceAppToRouter = ServiceAppToRouterImpl(this)

    internal val serviceRouterToCovidModule: IServiceRouterToCovidModule = ServiceRouterToCovidModuleImpl()
}