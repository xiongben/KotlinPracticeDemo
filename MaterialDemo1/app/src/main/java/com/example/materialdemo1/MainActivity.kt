package com.example.materialdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fruits = mutableListOf(
        Fruit("Banana", R.drawable.banana),
        Fruit("cherry", R.drawable.cherry),
        Fruit("Grape", R.drawable.grape),
        Fruit("Mango", R.drawable.mango)
    )
    val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeAsUpIndicator(R.drawable.ic_menu)
        }
        navView.setCheckedItem(R.id.navCall)
        navView.setNavigationItemSelectedListener {
            drawerLayout.closeDrawers()
            true
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Data deleted", Snackbar.LENGTH_SHORT)
                .setAction("Undo") {
                    Toast.makeText(this, "data restored", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> drawerLayout.openDrawer(GravityCompat.START)
            R.id.backup -> Toast.makeText(this, "you clicked Backup", Toast.LENGTH_SHORT).show()
            R.id.delete -> Toast.makeText(this, "you clicked Delete", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this, "you clicked Settings", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}