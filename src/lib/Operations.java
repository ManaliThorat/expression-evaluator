package lib;

/**
 * Created by manalit on 1/22/14.
 */
public class Operations {
    public int evaluate(int num1,String operator,int num2){
        int result = 0;
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

    public int addition(int num1,int num2){
        return num1 + num2;
    }
    public int substraction(int num1,int num2){
        return num1 - num2;
    }
    public int multiplication(int num1,int num2){
        return num1 * num2;
    }
    public int division(int num1,int num2){
        return num1 / num2;
    }
    public int exponential(int num1, int num2){
        return (int)Math.pow(num1,num2);
    }
}
