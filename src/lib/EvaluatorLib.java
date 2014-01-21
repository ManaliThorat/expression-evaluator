package lib;


public class EvaluatorLib {
    public String expression;
    public EvaluatorLib(String expression) {
        this.expression = expression;
    }
    public int evaluate(){
        String[] resultArray = this.expression.split(" ");
        int result = 0;
        int num1 = Integer.parseInt(resultArray[0]);
        int num2 = Integer.parseInt(resultArray[2]);
        if(0 == resultArray[1].compareTo("+"))
            result = addition(num1, num2);
        if(0 == resultArray[1].compareTo("-"))
            result = substraction(num1, num2);
        return result;
    }
    public int addition(int num1,int num2){
        return num1 + num2;
    }
    public int substraction(int num1,int num2){
        return num1 - num2;
    }
}
