package lib;

import java.util.ArrayList;
import java.util.List;

public class EvaluatorLib {
    public double evaluateExpression (String input) throws Exception {
        List<Double> operands = new ArrayList<Double>();
        List<String> operators = new ArrayList<String>();
        String exp = parseInput(input);
        if (input.contains("(")) {
            exp = evaluateParentheses(exp);
            return evaluateExpression(exp);
        }
        getOperators(exp, operands,operators);
        double result = evaluateMultipleOperations(operands, operators);
        return result;
    }

    private double evaluateMultipleOperations(List<Double> operands, List<String> operators) throws Exception {
        Operations opr = new Operations();
        double operator = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            operator = opr.evaluate(operator,operators.get(i),operands.get(i+1));

        }
        return operator;
    }

    private void getOperators(String expression, List<Double> operands,List<String> operators) throws Exception{
        String[] data = expression.split(" ");
        for (String s : data) {
            try {
                operands.add(Double.parseDouble(s));;
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
        List<Double> operandsInParentheses = new ArrayList<Double>();
        List<String> operatorsInParentheses = new ArrayList<String>();
        getOperators(expressionInParentheses.toString(), operandsInParentheses,operatorsInParentheses);
        double result = evaluateMultipleOperations(operandsInParentheses, operatorsInParentheses);
        exp.replace(startIndex, endIndex + 1, Double.toString(result));
        return exp.toString();
    }
    public String parseInput(String input) {
        return input.trim().replaceAll(" +", "")
                .replaceAll("\\+", " + ")
                .replaceAll("\\-", " - ")
                .replaceAll("\\*", " * ")
                .replaceAll("/", " / ")
                .replaceAll("\\(", "(")
                .replaceAll("\\)", ")")
                .replaceAll("\\^", " ^ ")
                .replaceAll("  - ", " -")
                .replaceFirst("^ - ", "-")
                .replaceAll("\\( - ", "(-")
                .replaceAll("\\--", " + ");

    }
}

//}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             