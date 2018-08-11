package com.example.freedom.firstkotlin.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.freedom.firstkotlin.R
import com.example.freedom.firstkotlin.showToast
import kotlinx.android.synthetic.main.activity_seccond.*


class SeccondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccond)

        //safe call   = ?.
        //safe call with let =  ?.let{...}

        val bundle: Bundle = intent.extras
        bundle?.let {
            val msg = bundle.getString("user_massage")
            showToast(msg)
            txtUserMessage.text = msg
        }
    }
}