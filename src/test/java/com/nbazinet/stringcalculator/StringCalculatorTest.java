package com.nbazinet.stringcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    
    @Test
    public void emptyString_shouldReturnZero() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        
        assertEquals(0, result);
    }
    
    @Test
    public void twoSmallSameNumber_shouldReturnTwice() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("2,2");
        
        assertEquals(4, result);
    }
    
    @Test
    public void twoSmallNotSameNumber_shouldReturnAddition() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3,5");

        assertEquals(8, result);
    }
    
    @Test
    public void oneNumber_shouldReturnThatNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");

        assertEquals(1, result);
    }
    
    @Test
    public void multipleNumber_shouldReturnSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2,3,5,8");

        assertEquals(19, result);
    }
    
    @Test
    public void inputWithNewLineInsteadOfComa_returnSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("5\n8,3");

        assertEquals(16, result);
    }
    
    @Test
    public void inputWithNewLineAfterComa_shouldCrash() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(RuntimeException.class, () -> calculator.add("5,\n"));
    }
}