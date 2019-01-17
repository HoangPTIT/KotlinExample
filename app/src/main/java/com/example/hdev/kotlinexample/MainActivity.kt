package com.example.hdev.kotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: Higher order function
        val higherFunction = HigherFunction()
        higherFunction.setName(this::showName)
    }

    fun showName(name: String?): Unit {
        Log.d(TAG, "Ten cua ban: $name")
    }
}
