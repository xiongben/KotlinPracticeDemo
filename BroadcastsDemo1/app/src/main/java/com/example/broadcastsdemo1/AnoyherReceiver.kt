package com.example.broadcastsdemo1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AnoyherReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "receive in anotherBroadcastReceiver", Toast.LENGTH_SHORT).show()
    }
}