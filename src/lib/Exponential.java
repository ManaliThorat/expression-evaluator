package lib;

public class Exponential implements Operation{
    double right;
    double left;

    public Exponential(double right, double left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double operate() {
        return Math.pow(right,left);
    }
}
