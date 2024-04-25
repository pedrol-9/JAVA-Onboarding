package day_4;

public class Calculator implements CalculatorOperations{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
