package it.unina.squidslab.spme;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtractPositive() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(5, 2));
    }

    @Test
    void testSubtractNegative() {
        Calculator calc = new Calculator();
        assertEquals(-3, calc.subtract(2, 5));
    }
}