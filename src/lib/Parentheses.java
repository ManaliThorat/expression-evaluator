package lib;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manalit on 2/7/14.
 */
public class Parentheses {
    public String evaluateParentheses(String expression) throws Exception {
        StringBuilder exp = new StringBuilder(expression);
        int startIndex = 0;
        int endIndex = 0;
        for (int index = 0; index < expression.length(); index++) {
            if (expression.charAt(index) == '(') {
                startIndex = index;
            }
            if (expression.charAt(index) == ')') {
                endIndex = index;
                break;
            }
        }
        String expressionInParentheses = exp.substring(startIndex + 1, endIndex);
        List<Double> operandsInParentheses = new ArrayList<Double>();
        List<String> operatorsInParentheses = new ArrayList<String>();
        Operater op = new Operater();
        op.getOperators(expressionInParentheses.toString(), operandsInParentheses,operatorsInParentheses);
        double result = evaluateMultipleOperations(operandsInParentheses, operatorsInParentheses);
        exp.replace(startIndex, endIndex + 1, Double.toString(result));
        return exp.toString();
    }
    private double evaluateMultipleOperations(List<Double> operands, List<String> operators) throws Exception {
        Operations opr = new Operations();
        double operator = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            operator = opr.evaluate(operator,operators.get(i),operands.get(i+1));

        }
        return operator;
    }
}
