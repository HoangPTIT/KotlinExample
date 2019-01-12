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
        // TODO: Ham - Function
        var a = 4;
        var b = 5;
        sum(a, b)
    }

    fun sum(a: Int, b: Int) {
        var c = a + b;
        Log.d(TAG, "TONG: $c")
    }
}
