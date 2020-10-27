package functions;

import base.Calc;
import base.logarithm.Log10;
import base.logarithm.Log2;
import base.logarithm.Log5;

public class Function2 implements Calc {

    private static final Log2 log2 = new Log2();
    private static final Log10 log10 = new Log10();
    private static final Log5 log5 = new Log5();

    public double calculate(double x, double accuracy) {
        return Math.pow(Math.pow(firstPart(x, accuracy), 2) - secondPart(x, accuracy), 2);
    }

    private double firstPart(double x, double ac) {
        return (log2.calculate(x, ac) / log5.calculate(x, ac)) * log10.calculate(x, ac);
    }

    private double secondPart(double x, double ac) {
        return log2.calculate(x, ac) - log2.calculate(x, ac);
    }

    public boolean odz(double x) {
        //todo
        return false;
    }
}
