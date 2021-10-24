package com.example.unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void add(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);

        assertEquals(3,result,"加法錯誤!");
        assertTrue(result > 1);
    }

    @Test
    public void divide(){
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class,() -> {
            calculator.divide(1,0);
        });
    }
}