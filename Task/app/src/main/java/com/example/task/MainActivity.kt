package com.example.task

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.task.databinding.ActivityDataCollectionBinding
import com.example.task.databinding.ActivityMainBinding
import com.example.task.ui.signup.DataCollectionActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        displayForm()
        binding.form.setOnClickListener {
            displayForm()
        }
    }

    private fun displayForm() {
        startActivity(Intent(this@MainActivity, DataCollectionActivity::class.java))
    }

}