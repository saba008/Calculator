package by.itacademy.calculator.sabatsevIgor;

import by.itacademy.calculator.sabatsevIgor.utils.CalculatorInputReader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        System.out.println("Вас приветствует Калькулятор!");

        while (true) {

            try {

                CalculatorInputReader calculatorInputReader = new CalculatorInputReader();

                System.out.println("Для начала работы выберите арифметическую операцию (для выбора введите номер пункта и нажмите Enter):");
                System.out.println("1. Сложение");
                System.out.println("2. Вычитание");
                System.out.println("3. Умножение");
                System.out.println("4. Деление");
                System.out.println("0. Выход");

                int operationNumber;

                Scanner input = new Scanner(System.in);

                operationNumber = input.nextInt();

                switch (operationNumber) {
                    case 1:
                        calculatorInputReader.performAddition();
                        break;
                    case 2:
                        calculatorInputReader.performSubtraction();
                        break;
                    case 3:
                        calculatorInputReader.performMultiplication();
                        break;
                    case 4:
                        calculatorInputReader.performDivision();
                        break;
                    default:
                        System.err.println("Такого пункта не существует! Попробуйте еще раз...");
                        break;
                    case 0:
                        System.exit(0);
                }

            } catch (InputMismatchException e) {
                System.err.println("Ошибка! Неверный формат ввода! " + "Попробуйте еще раз..." + "\n" + "Обращаю Ваше внимание на то, что разделителем для дробных чисел служит запятая!");
            }
        }
    }
}