package lib;

public class Operations {
    public double evaluate(double num1,String operator,double num2){
        double result = 0;
        if(0 == operator.compareTo("+")){
            result = new Addition(num1, num2).operate();
        }
        if(0 == operator.compareTo("-")) {
            result = new Substraction(num1, num2).operate();
        }
        if(0 == operator.compareTo("*")) {
            result = new Multiplication(num1, num2).operate();
        }
        if(0 == operator.compareTo("/")) {
            result = new Division(num1, num2).operate();
        }
        if(0 == operator.compareTo("^")) {
            result = new Exponential(num1, num2).operate();
        }
        return result;
    }
}
