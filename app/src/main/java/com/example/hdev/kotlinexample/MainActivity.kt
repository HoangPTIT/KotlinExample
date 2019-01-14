package com.example.hdev.kotlinexample

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
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
    val URL_JSON = "http://khoapham.vn/KhoaPhamTraining/json/tien/demo2.json"
    // La ham override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: JSON Array
        ReadJSONArray().execute(URL_JSON)
    }

    inner class ReadJSONArray : AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String?): String {
            var content: StringBuilder = StringBuilder()
            val urlConnect: HttpURLConnection = URL(params[0]).openConnection() as HttpURLConnection
            val bufferedReader: BufferedReader = BufferedReader(InputStreamReader(urlConnect.inputStream))
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
            // JSON Array
            val objectInfo : JSONObject = JSONObject(result)
            val jsonArray : JSONArray = objectInfo.getJSONArray("danhsach")
            var nameCourse : String = ""
            for (i in 0..jsonArray.length()-1){
                var objCourse : JSONObject = jsonArray.getJSONObject(i)
                nameCourse = objCourse.getString("khoahoc")
                Log.d(TAG, nameCourse)
            }
//            Toast.makeText(applicationContext, monhoc, Toast.LENGTH_LONG).show()
        }
    }
}
