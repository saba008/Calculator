package by.itacademy.calculator.sabatsevIgor.entities;

import by.itacademy.calculator.sabatsevIgor.exceptions.DivideByZeroException;

public class Calculator {

    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        try {
            if (number1 == 0 || number2 == 0)
                throw new DivideByZeroException();
        } catch (Exception e) {
            System.err.println("Деление на ноль запрещено! Попробуйте еще раз...");
        }
        return number1 / number2;
    }
}
