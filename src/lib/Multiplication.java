package lib;

public class Multiplication implements Operation {
    double right;
    double left;

    public Multiplication(double right, double left) {
        this.right = right;
        this.left = left;
    }
    @Override
    public double operate() {
        return this.right * this.left;
    }
}
