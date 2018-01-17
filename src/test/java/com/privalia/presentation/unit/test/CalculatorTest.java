package com.privalia.presentation.unit.test;

import com.privalia.presentation.Calculator;
import com.privalia.presentation.ICalculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    /**
     * Test only for academic purpouses
     */
    @Test
    public void testMockAdd(){
        Calculator calculator = mock(Calculator.class);
        when(calculator.add(2,3)).thenReturn(6);
        assertTrue(calculator.add(2,3)==6);
    }

    /*
     * Todo: add other tests...
     */
}
