package com.example.mybonustask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val see: TextView = findViewById(R.id.see)
        see.setOnClickListener{ viewImage(it)
        see.visibility = View.GONE}
    }
    private fun viewImage(view: View) {
        val image: ImageView = findViewById(R.id.me)
        val image2: ImageView = findViewById(R.id.me2)
        val image3: ImageView = findViewById(R.id.me3)
        val text: TextView = findViewById(R.id.textView2)

        view.visibility = View.VISIBLE
        image.visibility = View.VISIBLE
        image2.visibility = View.VISIBLE
        image3.visibility = View.GONE
        text.visibility = View.VISIBLE

    }
}