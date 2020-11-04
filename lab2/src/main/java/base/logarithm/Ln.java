package base.logarithm;

import base.Calc;

public class Ln implements Calc {


    public double calculate(double n, double accuracy) {
        if (odz(n)) {
            double num, mul, cal, sum = 0;
            num = (n - 1) / (n + 1);
            int i = 1;
            do {
                mul = (2 * i) - 1;
                cal = Math.pow(num, mul);
                cal = cal / mul;
                sum = sum + cal;
                i++;
            } while (Math.abs(cal) >= accuracy * 0.01);
            sum = 2 * sum;
            return sum;
        } else {
            return Double.NaN;
        }
    }

    public boolean odz(double x) {
        return x > 0;
    }
}
