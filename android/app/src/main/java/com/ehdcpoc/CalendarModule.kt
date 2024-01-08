package com.ehdcpoc

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CalendarModule(context: ReactApplicationContext): ReactContextBaseJavaModule(context) {
    override fun getName(): String {
        return "CalendarModule"
    }
    @ReactMethod
    fun createCalendarEvent() {
        Log.e("Calendar Module>>>>", "Log from cl module srini")
    }

}