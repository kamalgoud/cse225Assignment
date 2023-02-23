package com.example.assignment123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rating = findViewById<RatingBar>(R.id.rt)
        val b1 = findViewById<Button>(R.id.b1)
        val tv = findViewById<TextView>(R.id.tv1)
        val b2 = findViewById<Button>(R.id.reset)
        b1.setOnClickListener {
            val i: Float = rating.rating;
            tv.text = "Rating is "+i.toString()


            val vg: ViewGroup? = findViewById(R.id.custtoast)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.custtoast,vg)

            val tv = layout.findViewById<TextView>(R.id.custt1)
            tv.text = "Rating is "+i.toString()
            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL, 0 , 100)
            toast.duration = Toast.LENGTH_LONG
            toast.view= layout
            toast.show()
        }
        b2.setOnClickListener {
            rating.rating = 0F
            tv.text = "Submit Rating";
        }
    }
}



