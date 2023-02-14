package com.example.name_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et: EditText = findViewById(R.id.et)
        val btnStart: Button = findViewById(R.id.btnStart)

        //画面遷移
        btnStart.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            //値の受け渡し
            intent.putExtra("MY_NAME", et.text.toString())

            startActivity(intent)
        }
    }
}