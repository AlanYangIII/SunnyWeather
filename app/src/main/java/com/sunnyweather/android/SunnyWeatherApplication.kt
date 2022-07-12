package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "FWE7pzwFhinDKWdG"    //彩云天气的令牌

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context   //全局获取context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}