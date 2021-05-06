package com.alan.viewstorm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val view = findViewById<View>(R.id.iv_main)
        view.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    findViewById(R.id.iv_main), "share_image")
            ActivityCompat.startActivity(this, intent, compat.toBundle())
        }
    }
}