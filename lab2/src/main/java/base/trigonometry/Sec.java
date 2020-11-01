package base.trigonometry;

public class Sec extends Cos {

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
        return r != 0.5 && r != 1.5;
    }

}
