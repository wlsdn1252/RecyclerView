package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Data>()
        list.add(Data( "1", "name 1"))
        list.add(Data( "2", "name 2"))
        list.add(Data( "3", "name 3"))

        val adapter = Adapter(list)
        binding.lstUser.adapter = adapter
    }
}