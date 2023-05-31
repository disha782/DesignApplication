package com.example.designapplication

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.designapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
//        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
//        rounded.cornerRadius = 30f
//        binding.logo.setImageDrawable(rounded)

        val ImageView = findViewById<ImageView>(R.id.logo)
        ImageView.clipToOutline = true
    }
}