package com.scube.baacopening.AcOpening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.scube.baacopening.R

class AcOpeningCreateAccountActivity : AppCompatActivity() {
    private lateinit var btn_next : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_opening_create_account)
        btn_next = findViewById(R.id.btn_next)
    }
}