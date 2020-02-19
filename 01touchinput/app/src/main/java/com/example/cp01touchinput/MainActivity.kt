package com.example.cp01touchinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(ClickMeButtonOnClickHandler())
    }

    inner class ClickMeButtonOnClickHandler : View.OnClickListener {
        override fun onClick(v: View?) {
            when{
                edt_email.text.isBlank() -> {
                    Toast.makeText(this@MainActivity, "Email Required", Toast.LENGTH_LONG).show()
                }
                edtpass.text.isBlank() -> {
                    Toast.makeText(this@MainActivity, "Password Required", Toast.LENGTH_LONG).show()
                }
                else -> {
                    
                }
            }
        }
    }
}
