package base.trigonometry;

public class Csc extends Sin{

    @Override
    public double calculate(double x, double accuracy) {
        if (odz(x)) {
            return 1 / super.calculate(x, accuracy);
        } else {
            return Double.NaN;
        }
    }

    public boolean odz(double x) {
        double r = x / Math.PI;
        r = r % 2;
        return r != 0 && r != 1;
    }
}
