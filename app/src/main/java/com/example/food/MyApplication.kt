package com.example.food

import android.app.Activity
import android.app.Application
//import org.litepal.LitePal
//import org.litepal.LitePal


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Instance = this
//        LitePal.initialize(this) //初始化LitePal数据库
    }

    var mainActivity: Activity? = null

    companion object {
        var Instance: MyApplication? = null
    }
}