package com.example.zpolc.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.koushikdutta.ion.Ion
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gif = findViewById<ImageView>(R.id.imageView)
        Ion.with(gif).load("https://78.media.tumblr.com/tumblr_m0v7zqEX2l1r03eaxo1_r1_500.gif")
    }

    fun counter(view: View) {
        val showCounterTextView = counter

        val countString = showCounterTextView.text.toString()

        // converting string into int and then display it
        var count: Int = Integer.parseInt(countString)
        count++
        showCounterTextView.text = count.toString()
    }

    fun counterReset(view: View) {
        val showCounterTextView = counter

        val countString = showCounterTextView.text.toString()

        // converting string into int and then display it
        var count: Int = Integer.parseInt(countString)
        count = 0
        showCounterTextView.text = count.toString()
    }
}