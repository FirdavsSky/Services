package com.firdavs.android.services

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.firdavs.android.services.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.simpleService.setOnClickListener {

        }

    }
}