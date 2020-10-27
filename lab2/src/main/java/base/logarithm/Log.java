package base.logarithm;

public class Log extends Ln {

    public double calculate(double n, double accuracy, int base) {
        return super.calculate(n, accuracy) / super.calculate(base, accuracy);
    }

    @Override
    public boolean odz(double x) {
        //todo
        return super.odz(x);
    }
}
