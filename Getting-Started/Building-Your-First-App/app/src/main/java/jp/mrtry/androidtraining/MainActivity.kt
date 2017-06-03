package jp.mrtry.androidtraining

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {


    companion object Factory {
        val EXTRA_MESSAGE = "jp.mrtry.androidtraining.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_send) as Button

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent: Intent = Intent(this, DisplayMessageActivity::class.java)
        val editText: (EditText) = findViewById(R.id.edit_message) as EditText
        val message: String = editText.getText().toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}
