package com.example.madventure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.madventure.databinding.ActivitySignInBinding
import com.google.android.gms.wearable.Wearable

class SignInActivity : Activity() {

private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivitySignInBinding.inflate(layoutInflater)
     setContentView(binding.root)

    }

    fun signin(view: android.view.View) {
        val intent = Intent( this@SignInActivity,ResultActivity::class.java)

        startActivity(intent)

        finish()
    }
}