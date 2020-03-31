package com.example.splashscreen.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.splashscreen.R
import com.example.splashscreen.databinding.SplashScreenBinding
import com.example.splashscreen.ui.viewmodel.SplashScreenViewModel

class SplashScreen: AppCompatActivity() {

    val splashScreenViewModel = SplashScreenViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.splash_screen)
        val binding: SplashScreenBinding = DataBindingUtil.setContentView(this, R.layout.splash_screen)
        binding.splashScreenViewModel =  splashScreenViewModel
        splashScreenViewModel.getToken()
    }
}