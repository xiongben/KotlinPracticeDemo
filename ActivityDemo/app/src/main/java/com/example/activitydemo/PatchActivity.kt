package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PatchActivity : AppCompatActivity(), View.OnClickListener {

    private val msgList = mutableListOf<Msg>()
    private var adapter: MsgAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patch)
        initMsg()
        val layoutManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.chatList)
        val send = findViewById<Button>(R.id.send)
        recyclerView.layoutManager = layoutManager
        adapter = MsgAdapter(msgList)
        recyclerView.adapter = adapter
        send.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val send = findViewById<Button>(R.id.send)
        when(v) {
            send -> {
                val input = findViewById<EditText>(R.id.inputText)
                val recyclerView = findViewById<RecyclerView>(R.id.chatList)
                val content = input.text.toString()
                if (content.isNotEmpty()) {
                    val msg = Msg(content, Msg.TYPE_SENT)
                    msgList.add(msg)
                    adapter?.notifyItemInserted(msgList.size - 1)
                    recyclerView.scrollToPosition(msgList.size - 1)
                    input.setText("")
                }
            }
        }
    }

    private fun initMsg() {
        val msg1 = Msg("hello guy.", Msg.TYPE_RECEIVED)
        msgList.add(msg1)
        val msg2 = Msg("Hello.Who is that?", Msg.TYPE_SENT)
        msgList.add(msg2)
        val msg3 = Msg("This is Tom.Nice to meet you!This is Tom.Nice to meet you!This is Tom.Nice to meet you!This is Tom.Nice to meet you!This is Tom.Nice to meet you!This is Tom.Nice to meet you!", Msg.TYPE_RECEIVED)
        msgList.add(msg3)
    }
}