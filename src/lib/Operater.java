package lib;

import java.util.List;

public class Operater {
    public void getOperators(String expression, List<Double> operands, List<String> operators) {
        String[] data = expression.split(" ");
        for (String s : data) {
            try {
                operands.add(Double.parseDouble(s));;
            } catch (Exception e) {
                operators.add(s);
            }
        }
    }
}
