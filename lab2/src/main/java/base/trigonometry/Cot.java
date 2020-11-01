package base.trigonometry;

public class Cot extends Tan {

    @Override
    public double calculate(double x, double accuracy) {
        if (odz(x)) {
            return super.calculate(Math.PI / 2 - 90, accuracy);
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
