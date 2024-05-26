package com.hafidzi.lab08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hafidzi.lab08.databinding.ActivityMainBinding
import com.hafidzi.lab08.databinding.ActivityThanksBinding

class ThanksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThanksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThanksBinding.inflate(layoutInflater)
        val  view =binding.root
        setContentView(view)

        binding.nameTextView.text = intent.getStringExtra("name")
        binding.phoneTextView.text = intent.getStringExtra("phone")
        binding.pickupDateVerifTextView.text = intent.getStringExtra("date")

        binding.ratingBtn.setOnClickListener {
            binding.ratingTextView4.text = binding.ratingBar.rating.toString()
        }
        }
    }
