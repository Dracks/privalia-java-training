package com.privalia.presentation.unit.test;

import com.privalia.presentation.Calculator;
import com.privalia.presentation.ICalculator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    /**
     * Test only for academic purpouses
     */

    @Mock
    ICalculator iCalculator;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMockAdd(){
        when(iCalculator.add(2,3)).thenReturn(6);
        assertTrue(iCalculator.add(2,3)==6);
    }

    /*
     * Todo: add other tests...
     */
}
