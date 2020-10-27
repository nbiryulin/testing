package base.trigonometry;

public class Cos extends Sin {

    @Override
    public double calculate(double x, double accuracy) {
        return super.calculate(x + Math.PI / 2, accuracy);
    }

    public boolean odz(double x) {
        return true;
    }
}
