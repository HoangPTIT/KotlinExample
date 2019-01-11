package com.example.hdev.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var canBeNull: String? = "Something" // Bien nay co the null. Them "?" sau kieu du lieu
        canBeNull = canBeNull?.toLowerCase(); // Co the check null truoc
        var cantBeNull: String = "hoang"!! // Khong duoc phep null
        /*Khi goi bien co the null ma chua check null truoc, phai sd ? hoac !! de qd co chay lenh nay hay khong?
        * ?: null se bo qua lenh, nguoc lai se chay. Co the gan ve null
        * !!: null: Bao loi nhu java. Khong duoc gan ve null.
        * */
        // Check null trong Kotlin. ?: se check null. Null -> Gan gia tri mac dinh va nguoc lai.
        var someThing = canBeNull ?: "default"
    }
}
