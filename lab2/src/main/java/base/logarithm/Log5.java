package base.logarithm;

public class Log5 extends Log {

    @Override
    public double calculate(double n, double accuracy) {
        return super.calculate(n, accuracy, 5);
    }

    @Override
    public boolean odz(double x) {
        return super.odz(x);
    }
}
