package base.trigonometry;

import base.Calc;

public class Cot extends Cos {


    private static final Sin sin = new Sin();

    private static final Cos cos = new Cos();


    @Override
    public double calculate(double x, double accuracy) {
        if (odz(x)) {
            return cos.calculate(x, accuracy) / sin.calculate(x, accuracy);
        } else {
            return Double.NaN;
        }
    }

    public boolean odz(double x) {
        double r = x / Math.PI;
        r = r % 2;
        return r != 0 && r != 1 && r != -1;
    }
}
