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
        // TODO: Ham - OOP - Class.
        var students : Students = Students();
        students.setCode(12)
        students.setName("Hoang")
        students.setAddress("BG")
        Log.d(TAG, "Student: ${students.toString()}")
    }
}
