package lib;

import java.util.ArrayList;
import java.util.List;

public class EvaluatorLib {
    public int evaluateExpression (String input) throws Exception {
        List<Integer> operands = new ArrayList<Integer>();
        List<String> operators = new ArrayList<String>();
        String exp = input;
        if (input.contains("(")) {
            exp = evaluateParentheses(input);
            return evaluateExpression(exp);
        }
        getOperators(exp, operands,operators);
        if (operands.size() == 1) return operands.get(0);
        int result = evaluateMultipleOperations(operands, operators);
        return result;
    }

    private int evaluateMultipleOperations(List<Integer> operands, List<String> operators) throws Exception {
        Operations opr = new Operations();
        int result = opr.evaluate(operands.get(0), operators.get(0), operands.get(1));
        for (int i = 1; i < operators.size(); i++) {
            result = opr.evaluate(result, operators.get(i), operands.get(i + 1));
        }
        return result;
    }

    private void getOperators(String expression, List<Integer> operands,List<String> operators) {
        String[] data = expression.split(" ");
        for (String s : data) {
            try {
                int x = Integer.parseInt(s);
                operands.add(x);
            } catch (Exception e) {
                operators.add(s);
            }
        }
    }

    private String evaluateParentheses(String expression) throws Exception {
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
        List<Integer> operandsInParentheses = new ArrayList<Integer>();
        List<String> operatorsInParentheses = new ArrayList<String>();
        getOperators(expressionInParentheses.toString(), operandsInParentheses,operatorsInParentheses);
        int result = evaluateMultipleOperations(operandsInParentheses, operatorsInParentheses);
        exp.replace(startIndex, endIndex + 1, Integer.toString(result));
        return exp.toString();
    }
}

//}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             