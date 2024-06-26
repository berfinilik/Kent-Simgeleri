package com.berfinilik.kotlinkentsimgeleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berfinilik.kotlinkentsimgeleri.databinding.ActivityDetailsBinding
import com.berfinilik.kotlinkentsimgeleri.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent=intent
        //casting
        val selectedLandmark=intent.getSerializableExtra("landmark") as Landmark
        binding.nameText.text=selectedLandmark.name
        binding.countryText.text=selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)


    }
}