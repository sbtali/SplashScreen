package com.alisabet.splashscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        val postDelayed = handler.postDelayed(Runnable {
            run {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)

    }
}
