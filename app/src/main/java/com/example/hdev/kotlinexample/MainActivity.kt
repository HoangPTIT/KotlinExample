package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: Mang: 3 cach khai bao
        // Cach 1: Khong co mang String (StringArray)
        var numArray: IntArray = intArrayOf(1, 2, 3, 4); // int[] a = new int(4)
        // Cach 2: Co mang String
        var numArray2: List<String> = listOf("A", "B", "C"); // List<String> a = new List<>()
        // Cach 3: Khoi tao ArrayList roi add element.(Thuong dung)
        var array3: ArrayList<String> = ArrayList(); // ArrayList<String> b = new ArrayList<>()
        array3.add("A")
        array3.add("B")
    }
}
