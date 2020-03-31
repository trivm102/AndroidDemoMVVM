package com.example.splashscreen.ui.viewmodel

import androidx.databinding.ObservableField
import com.example.splashscreen.data.model.AppKeyModel

class SplashScreenViewModel {
    val token = ObservableField<String>()

    fun getToken() {
        token.set(AppKeyModel().token)
    }
}