package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: Vong lap For
        // i chay tu 0 -> 3
        for (i in 0..3) {
            Log.d(TAG, "Gia tri i: $i")
        }
        // VD: Chay tu 0 den bien a.
        var a = 3
        // i chay tu 0 -> 2. until-1
        for (i in 0 until a) {
            Log.d(TAG, "Until Gia tri i: $i")
        }
        // Lap nguoc: a -> 0
        for (i in a downTo 0) {
            Log.d(TAG, "Lap nguoc: Gia tri i: $i")
        }
        // Moi lan lap +b
        for (i in 0..a step 2){
            Log.d(TAG, "Step 2: Gia tri i: $i")
        }
    }
}
