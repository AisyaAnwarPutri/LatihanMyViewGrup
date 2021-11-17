package com.example.projectlatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Makanan Khas Sumatera Barat"

        val btnrendang: Button = findViewById(R.id.btn_rendang)
        btnrendang.setOnClickListener(this)

        val btndendeng: Button = findViewById(R.id.btn_dendeng)
        btndendeng.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when (v?.id){
            R.id.btn_rendang->{
                val rendangIntent = Intent(this@MainActivity, rendang::class.java)
                startActivity(rendangIntent)
            }
            R.id.btn_dendeng->{
                val dendengIntent = Intent(this@MainActivity, dendeng::class.java)
                startActivity(dendengIntent)
            }
        }
    }
}