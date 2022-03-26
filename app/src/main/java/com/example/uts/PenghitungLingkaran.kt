package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PenghitungLingkaran : AppCompatActivity() {
    lateinit var jariJari : EditText
    lateinit var hasil : EditText
    lateinit var btnPerhitung : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penghitung_lingkaran)
        jariJari = findViewById(R.id.jarijari)
        hasil = findViewById(R.id.hasil)
        btnPerhitung = findViewById(R.id.btnPerhitungan)
        btnPerhitung.setOnClickListener{
            val r : Int = Integer.parseInt(jariJari.text.toString())
            val hasilPerhitungan : Double = 3.14 * r * r
            hasil.setText(hasilPerhitungan.toString())
        }
    }
}