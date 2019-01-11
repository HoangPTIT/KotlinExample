package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG : String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khai bao kieu du lieu String
        var sName = "Hoang"
        var sAge = 2_2 // Co the su dung gach chan giua cac so ma gia tri khong thay doi (22)
        // Trong String co the truyen truc tiep bien vao ma khong phai cong chuoi nhu java.
        var price = 5;
        var total_price = "Price: $price"
        Log.d(TAG, "" + price)
        Log.d(TAG, "" + total_price)
        Log.d(TAG, "" + sName)
        Log.d(TAG, "" + sAge)
    }
}
