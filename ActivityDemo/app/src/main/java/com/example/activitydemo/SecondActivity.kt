package com.example.activitydemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (savedInstanceState != null) {
            val tempData = savedInstanceState.getString("data_key")
            tempData?.let { Log.d("secondActivity", it) }
        }

        var button2: Button = findViewById(R.id.btn2)
        button2.setOnClickListener {
            var intent = Intent()
            intent.putExtra("data-return", "hello firstActivity")
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("param1", data1)
            intent.putExtra("param2", data2)
            context.startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data-return", "hello firstActivity!")
        setResult(RESULT_OK, intent)
        finish()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        val tempData = "something you just typed"
        outState.putString("data_key", tempData)
    }
}