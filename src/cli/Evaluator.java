package cli;

import lib.EvaluatorLib;

public class Evaluator {
    public static void main(String[] args) throws Exception {
        EvaluatorLib evl = new EvaluatorLib();
        try {
            int res = evl.evaluateExpression(args[0]);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("wrong input");
        }

    }
}
