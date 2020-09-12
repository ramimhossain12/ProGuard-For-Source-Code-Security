package com.example.proguardforsourcecodesecurity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.proguardforsourcecodesecurity.a.MainActivity2

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btnId)
        button?.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnId -> {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}