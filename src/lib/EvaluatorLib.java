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
        if (operands.size() == 1) return operands.get(0);
        double result = evaluateMultipleOperations(operands, operators);
        return result;
    }

    private double evaluateMultipleOperations(List<Double> operands, List<String> operators) throws Exception {
        Operations opr = new Operations();
        if(operands.size() <2) return operands.get(0);
        double result = opr.evaluate(operands.get(0), operators.get(0), operands.get(1));
        for (int i = 1; i < operators.size(); i++) {
            result = opr.evaluate(result, operators.get(i), operands.get(i + 1));
        }
        return result;
    }

    private void getOperators(String expression, List<Double> operands,List<String> operators) {
        String[] data = expression.split(" ");
        for (String s : data) {
            try {
                double x = Double.parseDouble(s);
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
            if (expression.charAt(index) == ')') {                endIndex = index;
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
                .replaceAll("^\\( - ","(-");
    }
}

//}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             