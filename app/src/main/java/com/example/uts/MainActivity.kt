package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    lateinit var username: EditText
    lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        var pword = "admin"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.btnLogin)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        btnLogin.setOnClickListener{
            if(password.text.toString().equals(pword)){
                val i = Intent(this,Menu::class.java)
                val message = "Hello, " + username.text.toString()
                i.putExtra("message_key", message)
                startActivity(i)
            }else{
                Toast.makeText(getApplicationContext(),"Password Salah",Toast.LENGTH_SHORT).show();
            }
        }
    }
}