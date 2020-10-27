package base.trigonometry;

public class Sec extends Cos {

    @Override
    public double calculate(double x, double accuracy) {
        return 1 / super.calculate(x, accuracy);
    }

    public boolean odz(double x) {
        //todo
        return false;
    }

}
