package by.itacademy.calculator.sabatsevIgor.utils;

import by.itacademy.calculator.sabatsevIgor.entities.Calculator;
import by.itacademy.calculator.sabatsevIgor.exceptions.DivideByZeroException;

import java.util.Scanner;

public class CalculatorInputReader {

    Scanner input = new Scanner(System.in);
    Calculator calculator = new Calculator();
    private double firstNumber;
    private double secondNumber;

    public void performAddition() {
        System.out.println("Введите первое число");
        firstNumber = input.nextDouble();
        System.out.println("Введите второе число");
        secondNumber = input.nextDouble();
        System.out.println("Результат: " + firstNumber + " + " + secondNumber + " = " + calculator.addition(firstNumber, secondNumber));
    }

    public void performSubtraction() {
        System.out.println("Введите первое число");
        firstNumber = input.nextDouble();
        System.out.println("Введите второе число");
        secondNumber = input.nextDouble();
        System.out.println("Результат: " + firstNumber + " - " + secondNumber + " = " + calculator.subtract(firstNumber, secondNumber));
    }

    public void performMultiplication() {
        System.out.println("Введите первое число");
        firstNumber = input.nextDouble();
        System.out.println("Введите второе число");
        secondNumber = input.nextDouble();
        System.out.println("Результат: " + firstNumber + " * " + secondNumber + " = " + calculator.multiply(firstNumber, secondNumber));
    }

    public void performDivision() {
        System.out.println("Введите первое число");
        firstNumber = input.nextDouble();
        System.out.println("Введите второе число");
        secondNumber = input.nextDouble();
        try {
            if (firstNumber == 0 || secondNumber == 0)
                throw new DivideByZeroException();
        } catch (Exception e) {
            System.err.println("Деление на ноль запрещено! Попробуйте еще раз...");
            return;
        }
        System.out.println("Результат: " + firstNumber + " / " + secondNumber + " = " + calculator.divide(firstNumber, secondNumber));
    }
}
