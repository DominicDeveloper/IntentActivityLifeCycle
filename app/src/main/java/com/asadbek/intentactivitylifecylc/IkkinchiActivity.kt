package com.asadbek.intentactivitylifecylc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asadbek.intentactivitylifecylc.databinding.ActivityIkkinchiBinding

class IkkinchiActivity : AppCompatActivity() {
    lateinit var binding: ActivityIkkinchiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkkinchiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var malumot:String  = intent.getStringExtra("birinchi")!!
        var malumot2:String = intent.getStringExtra("ikkinchi")!!
        binding.textView.text = malumot

    }


}