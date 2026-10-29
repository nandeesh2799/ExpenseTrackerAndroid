package com.example.expensetracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinancialCalculationsTest {

    @Test
    public void testCalculateBalanceSurplus() {
        double income = 50000.0;
        double expense = 32000.0;
        double balance = FinancialCalculations.calculateBalance(income, expense);
        assertEquals(18000.0, balance, 0.001);
    }

    @Test
    public void testCalculateBalanceDeficit() {
        double income = 20000.0;
        double expense = 25000.0;
        double balance = FinancialCalculations.calculateBalance(income, expense);
        assertEquals(-5000.0, balance, 0.001);
    }

    @Test
    public void testCalculateRemainingBudget() {
        double budget = 40000.0;
        double spent = 15000.0;
        assertEquals(25000.0, FinancialCalculations.calculateRemainingBudget(budget, spent), 0.001);
    }

    @Test
    public void testBudgetProgressPercentage() {
        // Normal 50% spent
        assertEquals(50, FinancialCalculations.calculateBudgetProgressPercentage(10000.0, 5000.0));

        // 100% spent
        assertEquals(100, FinancialCalculations.calculateBudgetProgressPercentage(10000.0, 10000.0));

        // Overspent clamped to 100% for progress bar
        assertEquals(100, FinancialCalculations.calculateBudgetProgressPercentage(10000.0, 15000.0));

        // Zero budget edge case
        assertEquals(0, FinancialCalculations.calculateBudgetProgressPercentage(0.0, 500.0));
    }

    @Test
    public void testIsOverBudget() {
        assertTrue(FinancialCalculations.isOverBudget(10000.0, 12000.0));
        assertFalse(FinancialCalculations.isOverBudget(10000.0, 8000.0));
        assertFalse(FinancialCalculations.isOverBudget(10000.0, 10000.0));
        assertFalse(FinancialCalculations.isOverBudget(0.0, 500.0));
    }

    @Test
    public void testSavingsRate() {
        // Income 10,000, Expense 7,000 -> 30% savings rate
        assertEquals(30.0, FinancialCalculations.calculateSavingsRate(10000.0, 7000.0), 0.001);

        // Expense >= Income -> 0% savings rate
        assertEquals(0.0, FinancialCalculations.calculateSavingsRate(10000.0, 12000.0), 0.001);

        // 0 income -> 0% savings rate
        assertEquals(0.0, FinancialCalculations.calculateSavingsRate(0.0, 100.0), 0.001);
    }

    @Test
    public void testCategoryPercentage() {
        assertEquals(25.0, FinancialCalculations.calculateCategoryPercentage(2500.0, 10000.0), 0.001);
        assertEquals(0.0, FinancialCalculations.calculateCategoryPercentage(0.0, 10000.0), 0.001);
        assertEquals(0.0, FinancialCalculations.calculateCategoryPercentage(500.0, 0.0), 0.001);
    }

    @Test
    public void testTransactionValidation() {
        assertTrue(FinancialCalculations.isValidTransaction(100.0, "Income", "Salary"));
        assertTrue(FinancialCalculations.isValidTransaction(50.0, "Expense", "Food"));

        // Invalid cases
        assertFalse(FinancialCalculations.isValidTransaction(-10.0, "Income", "Salary"));
        assertFalse(FinancialCalculations.isValidTransaction(0.0, "Expense", "Food"));
        assertFalse(FinancialCalculations.isValidTransaction(100.0, "InvalidType", "Food"));
        assertFalse(FinancialCalculations.isValidTransaction(100.0, "Income", ""));
        assertFalse(FinancialCalculations.isValidTransaction(100.0, "Income", null));
        assertFalse(FinancialCalculations.isValidTransaction(Double.NaN, "Expense", "Bills"));
    }
}
