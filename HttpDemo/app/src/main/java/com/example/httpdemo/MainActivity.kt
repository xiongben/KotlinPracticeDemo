package com.example.httpdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendRequestBtn.setOnClickListener {
//            sendRequestWithHttpURLConnection()
            sendRequestWithOkHttp()
        }
    }

    private fun sendRequestWithHttpURLConnection() {
        thread {
            var connection: HttpURLConnection? = null
            try {
                val response = StringBuilder()
                val url = URL("https://api.github.com/users")
                connection = url.openConnection() as HttpURLConnection
                connection.connectTimeout = 8000
                connection.readTimeout = 8000
                val input = connection.inputStream
                val reader = BufferedReader(InputStreamReader(input))
                reader.use {
                    reader.forEachLine {
                        response.append(it)
                    }
                }
                parseJSONWithJSONObject(response.toString())
//                Log.d("MainActivity", response.toString())
            }catch (e: Exception){
                e.printStackTrace()
            }finally {
                connection?.disconnect()
            }
        }
    }

    private fun sendRequestWithOkHttp() {
        thread {
            try {
                val client = OkHttpClient()
                val request = Request.Builder()
                    .url("https://api.github.com/users")
                    .build()
                val response = client.newCall(request).execute()
                val responseData = response.body?.string() as String
                parseJSONWithGSON(responseData)
//                Log.d("MainActivity", responseData)
//                if (responseData != null) {
//                    val item = JSONArray(responseData).getJSONObject(0)
//                    val avatarUrl = item.getString("avatar_url")
//                    Log.d("MainActivity", avatarUrl)
//                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }



    private fun parseJSONWithJSONObject(jsonData: String) {
        try {
            val jsonArray = JSONArray(jsonData)
            for(i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray.getJSONObject(i)
                Log.d("MainActivity", jsonObject.toString())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun parseJSONWithGSON(jsonData: String) {
        val gson = Gson()
        val typeOf = object : TypeToken<List<User>>() {}.type
        val appList = gson.fromJson<List<User>>(jsonData, typeOf)
        for (user in appList) {
            Log.d("MainActivity", "login is ${user.login}")
        }
    }
}