package com.tani_pintar.app

import android.app.Application
import com.tani_pintar.app.di.initKoin

class MuseumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}
