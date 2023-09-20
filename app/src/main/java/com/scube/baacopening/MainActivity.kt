package com.scube.baacopening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.scube.baacopening.AcOpening.AcOpenWelcomeActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnGo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGo = findViewById(R.id.btnGo)
        btnGo.setOnClickListener {
            val intent = Intent(this, AcOpenWelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}