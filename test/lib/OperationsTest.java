package lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/22/14.
 */
public class OperationsTest {
    @Test
    public void testForAdditionOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        int expected = 5;
        int actual = evl.evaluate(2,"+", 3);
        assertEquals(expected,actual);
    }
    @Test
    public void testForSubstractionOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        int expected = 3;
        int actual = evl.evaluate(5,"-",2);
        assertEquals(expected,actual);
    }
    @Test
    public void testForMultiplicationOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        int expected = 10;
        int actual = evl.evaluate(5, "*", 2);
        assertEquals(expected,actual);
    }
    @Test
    public void testForDivisionOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        int expected = 5;
        int actual = evl.evaluate(10, "/", 2);
        assertEquals(expected,actual);
    }
    @Test
    public void testForExponentialOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        int expected = 100;
        int actual = evl.evaluate(10,"^", 2);
        assertEquals(expected,actual);
    }
}
