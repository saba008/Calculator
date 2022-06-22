package by.itacademy.calculator.sabatsevIgor.entities;

import by.itacademy.calculator.sabatsevIgor.exceptions.DivideByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(2, calculator.addition(1, 1), "Regular addition should work.");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, 2, calculator.subtract(2, 1), "Regular subtraction should work.");
    }

    @Test
    void testMultiplication() {
        assertEquals(4, calculator.multiply(2, 2), "Regular multiplication should work.");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(4, 2), "Regular division should work.");
    }


    @Test
    void testMultiplyingByZero() {
        assertEquals(0, calculator.multiply(1, 0), "Multiplying by zero always gives zero.");
        assertEquals(0, calculator.multiply(0, 1), "Multiplying by zero always gives zero.");
    }

    @Test
    void TestDivisionByZeroPerformance() {
        assertThrows(DivideByZeroException.class,
                () -> calculator.divide(0, 1));
    }
}