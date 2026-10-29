package com.example.expensetracker;

/**
 * Pure business logic and mathematical calculations for financial metrics,
 * budget tracking, and transaction validation.
 */
public class FinancialCalculations {

    /**
     * Calculate net balance from total income and total expense.
     */
    public static double calculateBalance(double totalIncome, double totalExpense) {
        return totalIncome - totalExpense;
    }

    /**
     * Calculate remaining budget given total monthly budget and amount spent.
     */
    public static double calculateRemainingBudget(double budget, double spent) {
        return budget - spent;
    }

    /**
     * Calculate budget utilization percentage [0 - 100].
     * Returns 0 if budget is non-positive.
     */
    public static int calculateBudgetProgressPercentage(double budget, double spent) {
        if (budget <= 0) {
            return 0;
        }
        double ratio = (spent / budget) * 100.0;
        return (int) Math.min(100, Math.max(0, Math.round(ratio)));
    }

    /**
     * Calculate savings rate percentage: ((income - expense) / income) * 100.
     * Returns 0.0 if income <= 0 or if expense exceeds income.
     */
    public static double calculateSavingsRate(double totalIncome, double totalExpense) {
        if (totalIncome <= 0 || totalExpense >= totalIncome) {
            return 0.0;
        }
        double savings = totalIncome - totalExpense;
        return (savings / totalIncome) * 100.0;
    }

    /**
     * Check if user has exceeded their designated budget.
     */
    public static boolean isOverBudget(double budget, double spent) {
        return budget > 0 && spent > budget;
    }

    /**
     * Calculate category percentage of total expenditure.
     */
    public static double calculateCategoryPercentage(double categoryAmount, double totalExpense) {
        if (totalExpense <= 0 || categoryAmount <= 0) {
            return 0.0;
        }
        return (categoryAmount / totalExpense) * 100.0;
    }

    /**
     * Validate transaction creation parameters.
     */
    public static boolean isValidTransaction(double amount, String type, String category) {
        if (amount <= 0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            return false;
        }
        if (type == null || (!type.equalsIgnoreCase("Income") && !type.equalsIgnoreCase("Expense"))) {
            return false;
        }
        return category != null && !category.trim().isEmpty();
    }
}
