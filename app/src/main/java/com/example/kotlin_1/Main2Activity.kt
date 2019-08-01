package com.example.kotlin_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val hoTen : String = intent.getStringExtra("data")
        val hoTen2 : Int = intent.getIntExtra("data2", 2000 )
        tv2.text = hoTen
        tv3.text = hoTen2.toString()
    }
}
