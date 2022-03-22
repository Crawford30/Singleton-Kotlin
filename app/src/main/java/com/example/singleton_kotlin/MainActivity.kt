package com.example.singleton_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.singleton_kotlin.models.ExampleSingleton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("DEBUG: ${ExampleSingleton.singletonUser}")
    }
}