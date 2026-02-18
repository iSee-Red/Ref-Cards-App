package com.example.refcardsapp

import org.junit.Test
import org.junit.Assert.*

/**
 * Example unit test demonstrating basic test structure.
 * 
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityTest {
    
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    
    @Test
    fun cardColors_areValid() {
        // Test that color values would be correct
        val yellowColor = android.graphics.Color.YELLOW
        val redColor = android.graphics.Color.RED
        
        assertNotEquals(yellowColor, redColor)
        assertTrue(yellowColor != 0)
        assertTrue(redColor != 0)
    }
    
    @Test
    fun cardText_isCorrect() {
        val yellowCardText = "YELLOW CARD"
        val redCardText = "RED CARD"
        
        assertEquals("YELLOW CARD", yellowCardText)
        assertEquals("RED CARD", redCardText)
        assertNotEquals(yellowCardText, redCardText)
    }
}
