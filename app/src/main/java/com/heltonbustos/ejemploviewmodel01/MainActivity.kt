package com.heltonbustos.ejemploviewmodel01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.heltonbustos.ejemploviewmodel01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("ESTADO", "onCreate()")

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btnRoll.setOnClickListener {
            mainViewModel.onBtnClick()
        }

        mainViewModel.numeroSuerte.observe(this, Observer {
            binding.tvLuckyNumber.text = it
        })
    }

    override fun onStart() {
        Log.d("ESTADO", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d("ESTADO", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d("ESTADO", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d("ESTADO", "onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("ESTADO", "onDestroy()")
        super.onDestroy()
    }
}