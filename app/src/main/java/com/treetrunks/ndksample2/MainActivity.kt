package com.treetrunks.ndksample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.treetrunks.jnimodule.JNIClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jni = JNIClass()
        val tv = findViewById<TextView>(R.id.textview1)
        tv.text = jni.getNumString("Native Method 호출", 1)
    }
}
