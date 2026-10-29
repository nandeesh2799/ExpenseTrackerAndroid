package com.example.expensetracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyUtilsTest {

    @Test
    public void testFormatCurrencyBasic() {
        String formatted = CurrencyUtils.formatCurrency(1500.0);
        assertNotNull(formatted);
        // Should contain 1,500 and Rupee symbol or INR
        assertTrue(formatted.contains("1,500") || formatted.contains("1500"));
    }

    @Test
    public void testFormatCurrencyZero() {
        String formatted = CurrencyUtils.formatCurrency(0.0);
        assertNotNull(formatted);
        assertTrue(formatted.contains("0.00") || formatted.contains("0"));
    }

    @Test
    public void testFormatCurrencyDecimals() {
        String formatted = CurrencyUtils.formatCurrency(99.95);
        assertNotNull(formatted);
        assertTrue(formatted.contains("99.95"));
    }

    @Test
    public void testFormatCurrencyLargeAmount() {
        String formatted = CurrencyUtils.formatCurrency(100000.0);
        assertNotNull(formatted);
        assertTrue(formatted.length() > 5);
    }
}
