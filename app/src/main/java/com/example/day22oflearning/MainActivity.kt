package com.example.day22oflearning

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.day22oflearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflate binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample data
        val tasklist = arrayListOf(
            "I get up 7am",
            "Go to Uni",
            "Back Home 2 PM",
            "Take Rest 2 Hours",
            "Go to Academy"
        )

        // Create an adapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, // built-in layout
            tasklist
        )

        // Attach adapter to ListView
        binding.myListView.adapter = adapter

        // Handle clicks on ListView items
        binding.myListView.setOnItemClickListener { _, _, position, _ ->
            val item = tasklist[position]
            Toast.makeText(this, "Clicked: $item", Toast.LENGTH_SHORT).show()
        }
    }
}
