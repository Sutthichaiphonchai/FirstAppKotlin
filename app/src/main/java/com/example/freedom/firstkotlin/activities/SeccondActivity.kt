package com.example.freedom.firstkotlin.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.freedom.firstkotlin.R
import kotlinx.android.synthetic.main.activity_seccond.*


class SeccondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccond)

        val bundle: Bundle = intent.extras
        val msg = bundle.getString("user_massage")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txtUserMessage.text = msg
    }
}