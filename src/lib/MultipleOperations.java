package lib;

import java.util.List;

public class MultipleOperations {
    public double evaluateMultipleOperations(List<Double> operands, List<String> operators) {
        Operations opr = new Operations();
        double operator = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            operator = opr.evaluate(operator,operators.get(i),operands.get(i+1));

        }
        return operator;
    }
}
