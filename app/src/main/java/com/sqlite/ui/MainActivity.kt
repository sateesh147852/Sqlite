package com.sqlite.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeView()
    }

    private fun initializeView() {
        binding.btCurdOperation.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        when (view?.id) {

            binding.btCurdOperation.id -> {
                Intent(this, CurdActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
    }
}