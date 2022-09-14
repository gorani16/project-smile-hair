package com.gorani.smilehair

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gorani.smilehair.databinding.ActivityGreetingBinding

class GreetingActivity: AppCompatActivity() {

    private lateinit var binding : ActivityGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_greeting)
        binding.greetingStartButton.setOnClickListener {

//            Toast.makeText(this, "Login Activity 로 이동합니다.", Toast.LENGTH_SHORT).show()
//            startActivity(Intent(this, LoginActivity::class.java))
//            ㄴ> 프래그먼트 구현을 위해 바로 MainActivity 로 이동하도록 임시로 설정함.

            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this, "MainActivity 로 이동합니다.", Toast.LENGTH_SHORT).show()

        }
    }
}