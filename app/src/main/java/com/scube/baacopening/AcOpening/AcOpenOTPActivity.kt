package com.scube.baacopening.AcOpening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.scube.baacopening.R

class AcOpenOTPActivity : AppCompatActivity() {
    private lateinit var btn_submit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_open_otpactivity)
        btn_submit = findViewById(R.id.btn_submit)
        btn_submit.setOnClickListener {
            val intent = Intent(this, AcOpeningCreateAccountActivity::class.java)
            startActivity(intent)
        }
    }
}