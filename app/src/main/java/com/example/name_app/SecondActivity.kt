package com.example.name_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n") //<-これが18行目のエラーを抑制してる
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName: TextView = findViewById(R.id.tvName)
        val btnBack: Button = findViewById(R.id.btnBack)

        //値の受け取り
        val MyName = intent.getStringExtra("MY_NAME")
        tvName.text = MyName + "さん"

        //戻る
        btnBack.setOnClickListener {
            finish()
        }
    }
}