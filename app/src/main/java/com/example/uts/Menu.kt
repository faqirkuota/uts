package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Menu : AppCompatActivity() {
    lateinit var btnPenghitungLingkaran : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        btnPenghitungLingkaran = findViewById(R.id.btnPenghitungLingkaran)
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.name)
        messageTextView.text =  message
        btnPenghitungLingkaran.setOnClickListener{
            var i = Intent(this,PenghitungLingkaran::class.java)
            startActivity(i)
        }
    }
}