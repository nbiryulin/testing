package base.trigonometry;

public class Csc extends Sin{

    @Override
    public double calculate(double x, double accuracy) {
        return 1 / super.calculate(x, accuracy);
    }

    public boolean odz(double x) {
        //todo
        return false;
    }
}
