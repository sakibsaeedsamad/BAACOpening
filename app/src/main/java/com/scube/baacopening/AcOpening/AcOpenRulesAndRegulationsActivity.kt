package com.scube.baacopening.AcOpening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.scube.baacopening.R

class AcOpenRulesAndRegulationsActivity : AppCompatActivity() {
    private lateinit var btn_proceed : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_open_rules_and_regulations)
        btn_proceed = findViewById(R.id.btn_proceed)
        btn_proceed.setOnClickListener {
            val intent = Intent(this, AcOpenVerificationActivity::class.java)
            startActivity(intent)
        }

    }
}