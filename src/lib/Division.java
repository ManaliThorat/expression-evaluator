package lib;

public class Division implements Operation {
    double right;
    double left;

    public Division(double right, double left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double operate() {
        return this.right / this.left;
    }
}
