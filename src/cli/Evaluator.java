package cli;

import lib.EvaluatorLib;

public class Evaluator {
    public static void main(String[] args) throws Exception {
        EvaluatorLib evl = new EvaluatorLib();
        int res = evl.EvaluateExpression(args[0]);
        System.out.println(res);
    }
}
