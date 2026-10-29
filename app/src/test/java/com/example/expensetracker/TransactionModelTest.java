package com.example.expensetracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionModelTest {

    @Test
    public void testTransactionModelGetters() {
        TransactionModel model = new TransactionModel(
                101,
                2450.75,
                "Expense",
                "Groceries",
                "2026-10-30",
                "Supermarket trip"
        );

        assertEquals(101, model.getId());
        assertEquals(2450.75, model.getAmount(), 0.001);
        assertEquals("Expense", model.getType());
        assertEquals("Groceries", model.getCategory());
        assertEquals("2026-10-30", model.getDate());
        assertEquals("Supermarket trip", model.getNote());
    }

    @Test
    public void testIncomeTransactionModel() {
        TransactionModel model = new TransactionModel(
                102,
                50000.0,
                "Income",
                "Salary",
                "2026-10-01",
                "Monthly salary credit"
        );

        assertEquals(102, model.getId());
        assertEquals(50000.0, model.getAmount(), 0.001);
        assertEquals("Income", model.getType());
        assertEquals("Salary", model.getCategory());
        assertEquals("2026-10-01", model.getDate());
        assertEquals("Monthly salary credit", model.getNote());
    }

    @Test
    public void testNullOrEmptyNoteHandling() {
        TransactionModel model = new TransactionModel(
                103,
                150.0,
                "Expense",
                "Transport",
                "2026-10-15",
                ""
        );

        assertEquals("", model.getNote());
    }
}
