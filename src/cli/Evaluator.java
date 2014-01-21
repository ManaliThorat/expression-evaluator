package cli;

import lib.EvaluatorLib;

public class Evaluator {
    public static void main(String[] args) {
        EvaluatorLib evl = new EvaluatorLib(args[0]);
        int res = evl.evaluate();
        System.out.println(res);
    }
}
