package com.example.day22oflearning

import android.content.Intent
import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.day22oflearning.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // پروفائلز کی لسٹ
        val profiles = arrayListOf(
            mapOf(
                "name" to "Adnan Shaheen",
                "role" to "Android Developer",
                "phone" to "0306 9050528",
                "city" to "Mianwali",
                "image" to R.drawable.adnan
            ),
            mapOf(
                "name" to "Imran Faiaz",
                "role" to "Full Stack Developer",
                "phone" to "0301-9876543",
                "city" to "Lahore",
                "image" to R.drawable.adnan
            ),
            mapOf(
                "name" to "Mubarak Shanzay",
                "role" to "Vice President BDS",
                "phone" to "0302-1112223",
                "city" to "Islamabad",
                "image" to R.drawable.ic_launcher_background
            )
        )

        val from = arrayOf("name", "role", "image")
        val to = intArrayOf(R.id.profileName, R.id.profileRole, R.id.profileImage)

        val adapter = SimpleAdapter(this, profiles, R.layout.profile_item, from, to)
        binding.profileListView.adapter = adapter

        // جب کسی پروفائل پر کلک ہو
        binding.profileListView.setOnItemClickListener { _, _, position, _ ->
            val selectedProfile = profiles[position]

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("name", selectedProfile["name"] as String)
            intent.putExtra("role", selectedProfile["role"] as String)
            intent.putExtra("phone", selectedProfile["phone"] as String)
            intent.putExtra("city", selectedProfile["city"] as String)
            intent.putExtra("image", selectedProfile["image"] as Int) // drawable id
            startActivity(intent)
        }
    }
}
