package com.tani_pintar.app.utils

import android.content.Context
import android.app.Application

object PlatformContextProvider {
    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context.applicationContext
    }

    fun getApplicationContext(): Context {
        if (!::applicationContext.isInitialized) {
            throw IllegalStateException("Context belum diinisialisasi. Pastikan memanggil PlatformContextProvider.init() di Application class")
        }
        return applicationContext
    }
}

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class PlatformContext(val context: Context)

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ContextProvider(private val context: Context) {
    actual fun getContext(): PlatformContext = PlatformContext(context)
}

actual fun getDensity(): Float {
    return PlatformContextProvider.getApplicationContext().resources.displayMetrics.density
}