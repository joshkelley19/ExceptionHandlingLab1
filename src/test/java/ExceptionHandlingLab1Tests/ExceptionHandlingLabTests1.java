package ExceptionHandlingLab1Tests;

import kelley.josh.ExceptionHandlingLab1.Calculator;
import kelley.josh.ExceptionHandlingLab1.ComplexNumberException;
import kelley.josh.ExceptionHandlingLab1.DivisionByZeroException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshuakelley on 9/30/16.
 */
public class ExceptionHandlingLabTests1 {
    int expected;
    int doubleExpected;
    @Before
    public void initialize(){
        expected=100;
        doubleExpected=100;
    }

    @Test
    public void addTests(){
        int actual = Calculator.add(55,45);
        assertEquals(expected,actual);
        actual = Calculator.add(99,1);
        assertEquals(expected,actual);
    }
    @Test
    public void subtractTests(){
        int actual = Calculator.subtract(250,150);
        assertEquals(expected,actual);
        actual = Calculator.subtract(-50,-150);
        assertEquals(expected,actual);
    }
    @Test
    public void multiplyTests(){
        int actual = Calculator.multiply(-25,-4);
        assertEquals(expected,actual);
        actual = Calculator.multiply(100,1);
        assertEquals(expected,actual);
    }
    @Test(expected = DivisionByZeroException.class)
    public void divideTests0() throws DivisionByZeroException {
        int actual = Calculator.divide(1000,10);
        assertEquals(expected,actual);
        Calculator.divide(10,0);
    }
    @Test(expected = ComplexNumberException.class)
    public void squareRootTest0() throws ComplexNumberException{
        double actual = Calculator.squareRoot(10000);
        assertEquals(doubleExpected,actual,1);
        Calculator.squareRoot(-1);
    }

}
