package com.privalia.calculator;

import com.privalia.exercice.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        String[] data= {"1","+","2"};
        int v = this.calculator.calc(data);

        assertEquals(v, 3);
    }

    @Test
    public void testSubs(){
        String[] data= {"1","-","2"};
        int v = this.calculator.calc(data);

        assertEquals(v, -1);
    }

    @Test
    public void testMul(){
        String[] data= {"2","*","3"};
        int v = this.calculator.calc(data);

        assertEquals(v, 6);
    }

    @Test
    public void testDiv(){
        String[] data= {"4","/","2"};
        int v = this.calculator.calc(data);

        assertEquals(v, 2);
    }

}
