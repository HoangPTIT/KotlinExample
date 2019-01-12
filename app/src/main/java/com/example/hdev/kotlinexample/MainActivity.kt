package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    // La ham override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: Data Class. La 1 class da chua du lieu.

        val transport : Transport = Transport("Bus", "Red")
        Log.d(TAG, "Transport: ${transport.name} ${transport.color}")
    }
}
