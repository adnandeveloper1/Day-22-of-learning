package com.example.day22oflearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.day22oflearning.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // ڈیٹا ریسیو کریں
        val name = intent.getStringExtra("name")
        val role = intent.getStringExtra("role")
        val phone = intent.getStringExtra("phone")
        val city = intent.getStringExtra("city")
        val imageRes = intent.getIntExtra("image", R.drawable.ic_launcher_background)

        // ویوز پر سیٹ کریں
        binding.profileImage.setImageResource(imageRes)
        binding.profileName.text = name
        binding.profileRole.text = role
        binding.profilePhone.text = "Phone: $phone"
        binding.profileCity.text = "City: $city"
    }
}
