package base.trigonometry;

public class Cot extends Tan {

    @Override
    public double calculate(double x, double accuracy) {
        return super.calculate(Math.PI / 2 - 90, accuracy);
    }

    public boolean odz(double x) {
        //todo
        return false;
    }
}
