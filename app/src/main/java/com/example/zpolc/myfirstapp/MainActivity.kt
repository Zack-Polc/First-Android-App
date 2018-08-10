package com.example.zpolc.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toast(view: View) {
                                        // (this, message, duration)
        val myToast = Toast.makeText(this, "sup", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun counter(view: View) {
        val showCounterTextView = counter

        val countString = showCounterTextView.text.toString()

        // converting string into int and then display it <- this is a fking great comment btw
        var count: Int = Integer.parseInt(countString)
        count++
        showCounterTextView.text = count.toString()
    }
}