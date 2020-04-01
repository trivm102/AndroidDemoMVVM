package com.example.splashscreen.data

import android.os.Handler
import com.example.keys.AppKeys

class APIService {

    fun verifyToken(param: OnDataReadyCallback) {
        fun verifyToken(onDataReadyCallback: OnDataReadyCallback) {
            val token = AppKeys().getToken()
            Handler().postDelayed({ onDataReadyCallback.onDataReady("token: $token") },2000)
        }
    }
}

interface OnDataReadyCallback {
    fun onDataReady(data : String)
}