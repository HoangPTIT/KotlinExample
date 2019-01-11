package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Cau lenh When: Bat nhieu dieu kien - switch:case
        var month = 4;
        when (month) {
            // in 1..3: Trong khoang
            1, 2, 3 -> {
                Log.d(TAG, "Thang: $month")
                Log.d(TAG, "Quy I")
            }
            4, 5, 6 -> {
                Log.d(TAG, "Thang: $month")
                Log.d(TAG, "Quy II")
            }
            7, 8, 9 -> {
                Log.d(TAG, "Thang: $month")
                Log.d(TAG, "Quy III")
            }
            10, 11, 12 -> {
                Log.d(TAG, "Thang: $month")
                Log.d(TAG, "Quy IV")
            }
            else -> Log.d(TAG, "Khong co gia tri quy")
        }

    }
}
