package com.example.refcardsapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var cardDisplay: View
    private lateinit var cardText: TextView
    private lateinit var yellowCardButton: Button
    private lateinit var redCardButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        cardDisplay = findViewById(R.id.cardDisplay)
        cardText = findViewById(R.id.cardText)
        yellowCardButton = findViewById(R.id.yellowCardButton)
        redCardButton = findViewById(R.id.redCardButton)
        resetButton = findViewById(R.id.resetButton)

        // Set click listeners
        yellowCardButton.setOnClickListener {
            showYellowCard()
        }

        redCardButton.setOnClickListener {
            showRedCard()
        }

        resetButton.setOnClickListener {
            resetCard()
        }
    }

    private fun showYellowCard() {
        cardDisplay.setBackgroundColor(Color.YELLOW)
        cardText.text = getString(R.string.yellow_card)
        cardText.setTextColor(Color.BLACK)
        cardDisplay.visibility = View.VISIBLE
        cardText.visibility = View.VISIBLE
    }

    private fun showRedCard() {
        cardDisplay.setBackgroundColor(Color.RED)
        cardText.text = getString(R.string.red_card)
        cardText.setTextColor(Color.WHITE)
        cardDisplay.visibility = View.VISIBLE
        cardText.visibility = View.VISIBLE
    }

    private fun resetCard() {
        cardDisplay.visibility = View.INVISIBLE
        cardText.visibility = View.INVISIBLE
    }
}
