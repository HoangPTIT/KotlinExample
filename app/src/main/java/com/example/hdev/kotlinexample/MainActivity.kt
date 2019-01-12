package com.example.hdev.kotlinexample

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    val URL_LINK = "http://khoapham.vn/"
    // La ham override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: Su dung Asynctask doc noi dung URL internet
        ReadContentURL().execute(URL_LINK)
    }

    inner class ReadContentURL : AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String?): String {
            var content: StringBuilder = StringBuilder()
            val url: URL = URL(params[0])
            val urlCon: HttpURLConnection = url.openConnection() as HttpURLConnection
            val inputStream: InputStream = urlCon.inputStream
            val inputStreamReader: InputStreamReader = InputStreamReader(inputStream)
            val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
            var line : String = ""
            try {
                do {
                    line = bufferedReader.readLine()
                    if (line != null){
                        content.append(line)
                    }
                } while (line != null)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return content.toString()
        }

        override fun onPostExecute(result: String?) {
            txt_content.setText(result)
        }
    }
}
