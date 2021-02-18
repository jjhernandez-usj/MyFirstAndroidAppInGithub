package es.usj.androidapps.mysecondandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var tvVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.visibility = TextView.INVISIBLE
        button.setOnClickListener { toggleVisibility() }
        // This is a comment to show how it is pushed to the cloud
        // Chat is working. Hooray!!!
    }

    private fun toggleVisibility() {
        val visibility = if(tvVisible) TextView.INVISIBLE else TextView.VISIBLE
        tvVisible = !tvVisible
        textView.visibility = visibility
    }
}