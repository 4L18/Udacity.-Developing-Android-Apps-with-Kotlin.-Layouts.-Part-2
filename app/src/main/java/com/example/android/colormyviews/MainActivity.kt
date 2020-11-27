package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one, box_two, box_three,
                box_four, box_five, red_button, yellow_button, green_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            box_one.id -> view.setBackgroundColor(Color.DKGRAY)
            box_two.id -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            box_three.id -> view.setBackgroundResource(android.R.color.holo_green_light)
            box_four.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            box_five.id -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for backgroundc
            red_button.id -> box_three.setBackgroundColor(Color.RED)
            yellow_button.id -> box_four.setBackgroundColor(Color.YELLOW)
            green_button.id -> box_five.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}