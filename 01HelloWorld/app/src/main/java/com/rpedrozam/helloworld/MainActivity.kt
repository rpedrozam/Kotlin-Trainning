package com.rpedrozam.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    //Variable global, ? indica que la variable puede ser null
    var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)

        var message: String = findViewById<TextView>(R.id.TextView).text.toString()
        Log.d("MyTextView", message)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            findViewById<TextView>(R.id.TextView).text = "Listo!"
        }else{
            findViewById<TextView>(R.id.TextView).text = "No disponible!"
        }
    }
}