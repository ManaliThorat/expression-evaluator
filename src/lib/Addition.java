package lib;

public class Addition implements Operation {
    double right;
    double left;

    public Addition(double right, double left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double operate() {
        return this.right + this.left;
    }


}
