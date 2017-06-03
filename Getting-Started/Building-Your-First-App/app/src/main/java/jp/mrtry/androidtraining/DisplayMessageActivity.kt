package jp.mrtry.androidtraining

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView: TextView = TextView(this)
        //textView.setTextSize(40)
        textView.setText(message)

        val layout: ViewGroup = findViewById(R.id.activity_display_message) as ViewGroup
        layout.addView(textView)
    }
}
