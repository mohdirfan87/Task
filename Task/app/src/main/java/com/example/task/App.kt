package com.example.task

import android.app.Application
import com.example.task.di.viewModelModule
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val moduleList = listOf(viewModelModule)
        // start koin with the module list
        startKoin(this, moduleList)
    }
}