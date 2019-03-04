package org.my.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    public Calculator calculator = new CalculatorImpl();

    @Test
    public void add() {
        int a = 1;
        int b = 2;
        int res = calculator.add(a, b);
        Assert.assertTrue(res == 3);
    }

    @Test
    public void subtract() {
        int a = 1;
        int b = 2;
        int res = calculator.subtract(a, b);
        Assert.assertSame(res, -1);
    }

    @Test
    public void multiply() {
        int a = 3;
        int b = 2;
        int res = calculator.multiply(a, b);
        Assert.assertSame(res, 6);
    }

    @Test
    public void devide() {
        int a = 10;
        int b = 4;
        float res = calculator.devide(a, b);
        Assert.assertTrue(res==2.5);
    }

}
