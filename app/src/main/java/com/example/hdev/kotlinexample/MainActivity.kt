package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: If - else
        var a = 10
        var b = 15
        if (a > b){
            Log.d(TAG, "A lon hon B")
        }else{
            Log.d(TAG, "A nho hon B")
        }
    }
}
