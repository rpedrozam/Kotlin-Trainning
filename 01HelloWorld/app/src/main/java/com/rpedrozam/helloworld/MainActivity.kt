package com.rpedrozam.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    //Variable global, ? para indicar que puede ser null
    var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)
        findViewById<Button>(R.id.btnPlay).setOnClickListener{speak()}


    }

    private fun speak(){
        var message: String = findViewById<TextView>(R.id.etMessage).text.toString()
        // !! indica que la variable no sera null
        tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            findViewById<TextView>(R.id.tvStatus).text = "The library is ready!"
            tts!!.setLanguage(Locale.US)
        }else {
            findViewById<TextView>(R.id.tvStatus).text = "No disponible!"
        }
    }
}