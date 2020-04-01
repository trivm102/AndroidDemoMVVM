package com.example.splashscreen.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.splashscreen.R
import com.example.splashscreen.databinding.ActivitySplashScreenBinding
import com.example.splashscreen.viewmodel.SplashScreenViewModel

class SplashScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding

    var viewModel = SplashScreenViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }
}
