package com.example.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var button2: Button = findViewById(R.id.btn2)
        button2.setOnClickListener {
            var intent = Intent()
            intent.putExtra("data-return", "hello firstActivity")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}