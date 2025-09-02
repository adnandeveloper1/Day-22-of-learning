package com.example.day22oflearning

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

        // Sample profiles
        val profiles = arrayListOf(
            mapOf("name" to "Adnan Shaheen", "role" to "Android Developer", "image" to R.drawable.adnan),
            mapOf("name" to "Imran Faiaz", "role" to "Full Stack Developer", "image" to R.drawable.adnan),
            mapOf("name" to "Mubarak Shanzay", "role" to "Vice President BDS", "image" to R.drawable.ic_launcher_background)
        )

        // Keys to map
        val from = arrayOf("name", "role", "image")
        val to = intArrayOf(R.id.profileName, R.id.profileRole, R.id.profileImage)

        // Adapter
        val adapter = SimpleAdapter(
            this,
            profiles,
            R.layout.profile_item,
            from,
            to
        )

        binding.profileListView.adapter = adapter
    }
}
