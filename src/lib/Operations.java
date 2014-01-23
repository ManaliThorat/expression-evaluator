package lib;

/**
 * Created by manalit on 1/22/14.
 */
public class Operations {
    public double evaluate(double num1,String operator,double num2){
        double result = 0;
        if(0 == operator.compareTo("+")){
            result = addition(num1, num2);
        }
        if(0 == operator.compareTo("-")) {
            result = substraction(num1, num2);
        }
        if(0 == operator.compareTo("*")) {
            result = multiplication(num1, num2);
        }
        if(0 == operator.compareTo("/")) {
            result = division(num1, num2);
        }
        if(0 == operator.compareTo("^")) {
            result = exponential(num1, num2);
        }
        return result;
    }

    public double addition(double num1,double num2){
        return num1 + num2;
    }
    public double substraction(double num1,double num2){
        return num1 - num2;
    }
    public double multiplication(double num1,double num2){
        return num1 * num2;
    }
    public double division(double num1,double num2){
        return num1 / num2;
    }
    public double exponential(double num1, double num2){
        return Math.pow(num1,num2);
    }
}
