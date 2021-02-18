package es.usj.androidapps.mysecondandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.visibility = TextView.INVISIBLE
        // This is a comment to show how it is pushed to the cloud
        // Chat is working. Hooray!!!
    }
}