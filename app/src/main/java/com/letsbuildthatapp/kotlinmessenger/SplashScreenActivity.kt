package com.letsbuildthatapp.kotlinmessenger

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.letsbuildthatapp.kotlinmessenger.R
import com.letsbuildthatapp.kotlinmessenger.messages.LatestMessagesActivity
import kotlinx.android.synthetic.main.activity_login.*

class SplashScreenActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(4000)

                    val intent = Intent(baseContext, LatestMessagesActivity::class.java)
                    startActivity(intent)
                }
                catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}