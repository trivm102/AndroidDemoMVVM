package com.example.splashscreen.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.databinding.ObservableField
import com.example.splashscreen.data.APIService
import com.example.splashscreen.data.OnDataReadyCallback

class SplashScreenViewModel(val context: Context) {
    var api = APIService()

    val text = ObservableField<String>()

    val isLoading = ObservableField<Boolean>()

    fun verifyToken(){
        isLoading.set(true)
        api.verifyToken(object: OnDataReadyCallback {
            override fun onDataReady(data: String) {
                isLoading.set(false)
                text.set(data)
                Toast.makeText(context, "verify sucess", Toast.LENGTH_LONG).show()
            }
        })
    }
}