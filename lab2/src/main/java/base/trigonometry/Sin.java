package base.trigonometry;


import base.Calc;

public class Sin implements Calc {

    public double calculate(double x, double accuracy) {
        if (!odz(x)) {
            throw new ArithmeticException();
        }
        double result = 0;
        int n = 1;
        double term = x;
        while (Math.abs(term) >= accuracy) {
            result += term;
            term *= -((x / (n + 1)) * (x / (n + 2)));
            n += 2;
        }
        return result;
    }

    public boolean odz(double x) {
        return true;
    }


}
