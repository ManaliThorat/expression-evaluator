package lib;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by manalit on 1/20/14.
 */
public class EvaluatorLibTest {
    @Test
    public void testEvaluate() throws Exception {
        String input = "1 + 2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 3;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testEvaluateForMultipleOperations() throws Exception {
        String input = "1 + 2 * 2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 6;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testEvaluateFor4Operations() throws Exception {
        String input = "1 + 2 * 2 - 2 / 2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 2;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testEvaluateForParenthesesOperations() throws Exception {
        String input = "(1 + 2) * 2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 6;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testEvaluateForParenthesesOperationsAtEnd() throws Exception {
        String input = "1 + (2 * 2)";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 5;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testOnlyOneOperand() throws Exception {
        String input = "2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 2;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testSimgleNestedBrackets() throws Exception {
        String input = "(2 + (2 * 3))";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 8;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testMultipleNestedBrackets() throws Exception {
        String input = "(2 + (2 * 3)) + ((6 / 2) + 1)";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 12;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForAddition() throws Exception {
        String input = "2 +3";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 5;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForsubstraction() throws Exception {
        String input = "2 -3";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = -1;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForMultiplication() throws Exception {
        String input = "2 *3";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 6;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForDivision() throws Exception {
        String input = "10/ 2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 5;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForExponential() throws Exception {
        String input = "10^ 2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 100;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForMultipleOperations() throws Exception {
        String input = "10/ 2 -2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 3;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }

    @Test
    public void testTrimSpacesNegativeNumbers() throws Exception {
        String input = "10+-2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 8;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForSingleBracket() throws Exception {
        String input = "10+(2 +2)";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 14;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void testTrimSpacesForMultipleBracket() throws Exception {
        String input = "10+(2 +( 2-1))";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 13;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void TestTwoNegativeNumbers() throws Exception {
        String input = "-1-1";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = -2;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }

    @Test
    public void TestSpaceInNumber() throws Exception {
        String input = "2 2 +2";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 24;
        double res = evl.evaluateExpression(input);
        assertEquals(res, expected);
    }
    @Test
    public void TestStartWithMinus() throws Exception {
        String input = "( -1 )";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = -1;
        double res = evl.evaluateExpression(input);
        assertEquals(expected,res);
    }
    @Test
    public void TestMultipleBrackets() throws Exception {
        String input = "(((((( 4 ))))))";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 4;
        double res = evl.evaluateExpression(input);
        assertEquals(expected,res);
    }
    @Test
    public void TestMinusInBracket() throws Exception {
        String input = "32+(-2)";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 30;
        double res = evl.evaluateExpression(input);
        assertEquals(expected,res);
    }
    @Test
    public void TestTwoMinusSigns() throws Exception {
        String input = "-(-2)";
        EvaluatorLib evl = new EvaluatorLib();
        double expected = 2;
        double res = evl.evaluateExpression(input);
        assertEquals(expected,res);
    }
}
