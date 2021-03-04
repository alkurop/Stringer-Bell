package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.github.alkurop.stringerbell.Stringer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.preview).text = Stringer.OfRes(R.string.hello_world).bell(this)
        findViewById<TextView>(R.id.preview_params).text =
            Stringer.OfRes(R.string.hello_param_string_name, "Alex", 86).bell(this)
        findViewById<TextView>(R.id.preview_of_string).text = Stringer.OfString("Go Home").bell(this)
    }
}