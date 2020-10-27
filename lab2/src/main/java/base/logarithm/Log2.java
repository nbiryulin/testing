package base.logarithm;

public class Log2 extends Log {

    @Override
    public double calculate(double n, double accuracy) {
        return super.calculate(n, accuracy, 2);
    }

    @Override
    public boolean odz(double x) {
        return super.odz(x);
    }
}
