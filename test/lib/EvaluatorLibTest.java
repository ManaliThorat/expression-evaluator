package lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/20/14.
 */
public class EvaluatorLibTest {
    @Test
    public void testEvaluate() throws Exception {
        String input = "1 + 2";
        EvaluatorLib evl = new EvaluatorLib(input);
        int res = evl.evaluate();
        assertEquals(res,3);
    }
    @Test
    public void testForAdditionOfTwoNumbers() throws Exception {
        EvaluatorLib evl = new EvaluatorLib("2 + 3");
        int expected = 5;
        int actual = evl.evaluate();
        assertEquals(expected,actual);
    }
    @Test
    public void testForSubsrtactionOfTwoNumbers() throws Exception {
        EvaluatorLib evl = new EvaluatorLib("5 - 2");
        int expected = 3;
        int actual = evl.evaluate();
        assertEquals(expected,actual);
    }
}
