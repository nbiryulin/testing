package base.logarithm;

public class Log10 extends Log {

    @Override
    public double calculate(double n, double accuracy) {
        return super.calculate(n, accuracy, 10);
    }

    @Override
    public boolean odz(double x) {
        return super.odz(x);
    }
}
