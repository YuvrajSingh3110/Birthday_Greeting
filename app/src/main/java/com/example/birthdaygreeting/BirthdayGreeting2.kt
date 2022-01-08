package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BirthdayGreeting2 : AppCompatActivity() {
    companion object{
        lateinit var text: String
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting2)
        val name = intent.getStringExtra(NAME_EXTRA)
        BirthdayGreeting2.text = "Happy Birthday $name"
    }

    fun createBirthdayCard(view: android.view.View) {}
}