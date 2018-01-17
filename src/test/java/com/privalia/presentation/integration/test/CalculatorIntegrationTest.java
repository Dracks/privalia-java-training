package com.privalia.presentation.integration.test;

import com.privalia.presentation.Calculator;
import com.privalia.presentation.ICalculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorIntegrationTest {

    @Test
    public void testAdd(){
        ICalculator calculator = new Calculator();
        assertTrue(calculator.add(2,3)==5);
    }

    // @todo: pending all other methods

}
