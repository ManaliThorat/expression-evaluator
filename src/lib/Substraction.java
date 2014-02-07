package lib;

public class Substraction implements Operation {
    double right;
    double left;
    public Substraction(double right, double left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double operate() {
        return this.right - this.left;
    }
}
