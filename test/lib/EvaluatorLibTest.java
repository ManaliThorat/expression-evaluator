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
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(input);
        assertEquals(res,3);
    }
    @Test
    public void testEvaluateForMultipleOperations() throws Exception {
        String input = "1 + 2 * 2";
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(input);
        assertEquals(res,6);
    }
    @Test
    public void testEvaluateFor4Operations() throws Exception {
        String input = "1 + 2 * 2 - 2 / 2";
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(input);
        assertEquals(res,2);
    }
    @Test
    public void testEvaluateForParanthisesOperations() throws Exception {
        String input = "(1 + 2) * 2";
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(input);
        assertEquals(res,6);
    }
    @Test
    public void testEvaluateForParanthisesOperationsAtEnd() throws Exception {
        String input = "1 + (2 * 2)";
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(input);
        assertEquals(res,5);
    }
    @Test
    public void testOnlyOneOperand() throws Exception {
        String input = "2";
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(input);
        assertEquals(res,2);
    }


}
