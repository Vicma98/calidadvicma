package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    @Test
    void testAddition(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(2,3));
    }
    @Test
    void testMultiplication(){
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2,3));
    }

    @Test
    void testDivide(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.divide(25,5));
    }

    @Test
    void testSubstract(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.substract(4,2));
    }
}