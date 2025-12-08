package com.azad.composeuiandroidlab

import android.util.Log

object Util {
    val DATA_POINTS_LOGGER = "DATA_POINTS_LOGGER"
    fun Any?.slog(logLevel: Int = Log.DEBUG){
            when (logLevel) {
                Log.VERBOSE -> Log.v(DATA_POINTS_LOGGER , "::- ${this ?: "null"} -::")
                Log.DEBUG -> Log.d(DATA_POINTS_LOGGER , "::- ${this ?: "null"} -::")
                Log.INFO -> Log.i(DATA_POINTS_LOGGER , "::- ${this ?: "null"} -::")
                Log.WARN -> Log.w(DATA_POINTS_LOGGER , "::- ${this ?: "null"} -::")
                Log.ERROR -> Log.e(DATA_POINTS_LOGGER , "::- ${this ?: "null"} -::")
                Log.ASSERT -> Log.wtf(DATA_POINTS_LOGGER , "::- ${this ?: "null"} -::")
        }
    }
}