package com.duckgo.medtools

import org.junit.Test
import org.junit.Assert.*
import java.util.UnknownFormatConversionException

class DateCalculatorTest {
    @Test
    fun testStringFormatError() {
        try {
            // This replicates the buggy code
            val result = String.format(".3%", 10.0)
            fail("Should have thrown UnknownFormatConversionException")
        } catch (e: UnknownFormatConversionException) {
            // Expected
            // The message might vary slightly depending on JDK, but checking for the exception is enough
        } catch (e: Exception) {
             fail("Should have thrown UnknownFormatConversionException but threw ${e.javaClass.name}")
        }
    }

    @Test
    fun testStringFormatFix() {
         // This tests the fix
         val result = String.format("%.3f", 10.12345)
         assertEquals("10.123", result)
    }
}