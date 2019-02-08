package com.leaky.amankeldi.leakyapplication.application

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class LeakyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if(LeakCanary.isInAnalyzerProcess(this)) return

        LeakCanary.install(this)
        System.gc()
    }
}