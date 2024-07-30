package FinancialForecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case:
        if (years == 0) {
            return principal;
        }

        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double principal = 1000.0; // Initial investment
        double rate = 0.05; // Annual growth rate (5%)
        int years = 10; // Number of years to forecast

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
