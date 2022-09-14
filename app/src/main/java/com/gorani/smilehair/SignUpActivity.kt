package com.gorani.smilehair

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gorani.smilehair.databinding.ActivitySignupBinding

class SignUpActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)

        binding.signupButton.setOnClickListener {

            Toast.makeText(this, "회원가입 완료!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            // TODO 1. 입력값에 대한 유효성 검사(이메일, 비밀번호, 닉네임)
            // TODO 2. 회원가입 처리

        }


    }
}