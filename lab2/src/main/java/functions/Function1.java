package functions;

import base.Calc;
import base.trigonometry.*;


public class Function1 implements Calc {

    private final Cot cot = new Cot();
    private final Csc csc = new Csc();
    private final Sec sec = new Sec();
    private final Sin sin = new Sin();
    private final Tan tan = new Tan();


    public double calculate(double x, double accuracy) {
        return firstPart(x, accuracy) * secondPart(x, accuracy);
    }

    private double firstPart(double x, double ac) {
        if (odz(x)) {
            return Math.pow((csc.calculate(x, ac) - cot.calculate(x, ac) + sin.calculate(x, ac)) / sec.calculate(x, ac), 2);
        } else {
            return Double.NaN;
        }
    }

    private double secondPart(double x, double ac) {
        return tan.calculate(x, ac) - (tan.calculate(x, ac) - sec.calculate(x, ac));
    }

    public boolean odz(double x) {
        return csc.odz(x) && cot.odz(x) && sec.odz(x) && tan.odz(x);
    }
}
