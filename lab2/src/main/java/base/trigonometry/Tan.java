package base.trigonometry;

import base.Calc;

public class Tan extends Cos {

    private static final Sin sin = new Sin();

    private static final Cos cos = new Cos();


    public double calculate(double x, double accuracy) {
        if (odz(x)) {
            return sin.calculate(x, accuracy) / cos.calculate(x, accuracy);
        } else {
            return Double.NaN;
        }
    }

    public boolean odz(double x) {
        double r = x / Math.PI;
        r = r % 2;
        return r != 0.5 && r != 1.5 && r!=-0.5 && r!=-1.5;
    }
}
