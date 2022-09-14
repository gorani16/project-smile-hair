package com.gorani.smilehair

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gorani.smilehair.databinding.ActivityLoginBinding

class LoginActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.loginButtonStart.setOnClickListener {
            Toast.makeText(this, "로그인 버튼 클릭", Toast.LENGTH_SHORT).show()
            // TODO 1. 입력값(아이디, 비밀번호) 유효성 검사
            // TODO 2. 로그인 처리 (성공, 실패(예외 처리))

        }

        binding.loginButtonSignup.setOnClickListener {
            Toast.makeText(this, "회원가입 페이지로 이동합니다.", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
}