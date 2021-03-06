package com.example.buddychat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val email:String=editTextTextEmailAddress.text.toString()
            val password:String=editTextTextPassword.text.toString()

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                email,
                password
            )
            startActivity(Intent(this,ChatActivity::class.java))
        }
    }
}
