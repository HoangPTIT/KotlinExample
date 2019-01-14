package com.example.hdev.kotlinexample

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    val URL_JSON = "http://khoapham.vn/KhoaPhamTraining/json/tien/demo1.json"
    // La ham override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: JSON Oject
        ReadJSON().execute(URL_JSON)
    }

    inner class ReadJSON : AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String?): String {
            var content: StringBuilder = StringBuilder()
            val url: URL = URL(params[0])
            val urlConnect: HttpURLConnection = url.openConnection() as HttpURLConnection
            val inputStreamReader: InputStreamReader = InputStreamReader(urlConnect.inputStream)
            val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
            var line: String = ""
            try {
                do {
                    line = bufferedReader.readLine()
                    if (line != null) {
                        content.append(line)
                    }
                } while (line != null)
                bufferedReader.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return content.toString()
        }

        override fun onPostExecute(result: String?) {
            // ParseJSON to Object
            val objectInfo : JSONObject = JSONObject(result)
            val monhoc : String = objectInfo.getString("monhoc")
            Toast.makeText(applicationContext, monhoc, Toast.LENGTH_LONG).show()
            Log.d(TAG, result)
        }
    }
}
