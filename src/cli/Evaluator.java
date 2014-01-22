package cli;

import lib.EvaluatorLib;

public class Evaluator {
    public static void main(String[] args) throws Exception {
        EvaluatorLib evl = new EvaluatorLib();
        System.out.println(args[0]);
        int res = evl.EvaluateExpression(args[0]);
        System.out.println(res);
    }
}
