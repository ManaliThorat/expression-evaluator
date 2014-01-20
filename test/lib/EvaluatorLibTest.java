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
        int res = evl.evaluate(input);
        assertEquals(res,1);
    }
}
