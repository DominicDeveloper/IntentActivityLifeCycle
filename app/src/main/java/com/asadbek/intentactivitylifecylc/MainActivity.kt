package com.asadbek.intentactivitylifecylc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.asadbek.intentactivitylifecylc.databinding.ActivityMainBinding

const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn2.setOnClickListener {
            val intent = Intent(this,IkkinchiActivity::class.java)
            intent.putExtra("birinchi",binding.txt.text.toString().trim())
            intent.putExtra("ikkinchi",binding.txt.text.toString().trim())
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Dominic: Resumega tushdi")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Dominic: Stopga tushdi")
        
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Dominic: Pausega tushdi")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Dominic: Restartga tushdi")
       // binding.textView.text = SaveMyData.save
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Dominic: Destroyed")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d(TAG, "Dominic: Ortga qaytildin")
    }
}