package com.example.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        var button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
//            Toast.makeText(this, "You click button1!!!", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)

            val intent = Intent("com.example.activitytest.ACTION_START")
            intent.addCategory("com.example.activitytest.MY_CATEGORY")
//            startActivity(intent)
            startActivityForResult(intent, 1)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "you click add!", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "you click remove", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnedData = data?.getStringExtra("data-return")
                Log.d("FirstActivity", "return data is: $returnedData")
            }
        }
    }
}