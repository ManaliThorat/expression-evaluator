package lib;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by manalit on 1/22/14.
 */
public class OperationsTest {
    @Test
    public void testForAdditionOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        double expected = 5;
        double actual = evl.evaluate(2,"+", 3);
        assertEquals(actual, expected);
    }
    @Test
    public void testForSubstractionOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        double expected = 3;
        double actual = evl.evaluate(5,"-",2);
        assertEquals(expected,actual);
    }
    @Test
    public void testForMultiplicationOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        double expected = 10;
        double actual = evl.evaluate(5, "*", 2);
        assertEquals(expected,actual);
    }
    @Test
    public void testForDivisionOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        double expected = 5;
        double actual = evl.evaluate(10, "/", 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testForExponentialOfTwoNumbers() throws Exception {
        Operations evl = new Operations();
        double expected = 100;
        double actual = evl.evaluate(10,"^", 2);
        assertEquals(expected,actual);
    }
}
