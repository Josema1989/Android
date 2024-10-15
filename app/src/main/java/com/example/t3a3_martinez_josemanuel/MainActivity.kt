package com.example.t3a3_martinez_josemanuel


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.t3a3_martinez_josemanuel.R.id.welcomeTextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val dni = intent.getStringExtra("DNI")
        val welcomeTextView: TextView = findViewById(welcomeTextView)
        welcomeTextView.text = "Bienvenido/a, $dni"
    }
}

