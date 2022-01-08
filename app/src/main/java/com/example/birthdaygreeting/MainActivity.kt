package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun createBirthdayCard(view: View) {
       val input: EditText = this.findViewById(R.id.input)
       val name = input.text.toString()
       val intent = Intent( this, BirthdayGreeting2::class.java)
        intent.putExtra(BirthdayGreeting2.NAME_EXTRA, name)
      startActivity(intent)
    }
}