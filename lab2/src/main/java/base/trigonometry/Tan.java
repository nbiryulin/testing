package base.trigonometry;

import base.Calc;

public class Tan implements Calc {

    private static final Sin sin = new Sin();

    private static final Cos cos = new Cos();


    public double calculate(double x, double accuracy) {
        return sin.calculate(x, accuracy) / cos.calculate(x, accuracy);
    }

    public boolean odz(double x) {
        //todo
        return false;
    }
}
