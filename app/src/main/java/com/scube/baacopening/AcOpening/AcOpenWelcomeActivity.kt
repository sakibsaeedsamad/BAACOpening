package com.scube.baacopening.AcOpening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.scube.baacopening.R

class AcOpenWelcomeActivity : AppCompatActivity() {
    lateinit var btn_from_overseas: Button
    lateinit var btn_from_bangladesh: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_open_welcome)
        btn_from_overseas = findViewById(R.id.btn_from_overseas)
        btn_from_bangladesh = findViewById(R.id.btn_from_bangladesh)

        btn_from_overseas.setOnClickListener {
            val intent = Intent(this, AcOpenRulesAndRegulationsActivity::class.java)
            startActivity(intent)
        }
        btn_from_bangladesh.setOnClickListener {
            val intent = Intent(this, AcOpenRulesAndRegulationsActivity::class.java)
            startActivity(intent)
        }
    }
}