package system;

import base.Calc;
import functions.Function1;
import functions.Function2;

public class Main implements Calc {

    private static final Function1 function1 = new Function1();
    private static final Function2 function2 = new Function2();


    public double calculate(double x, double accuracy) {
        if (x > 0) {
            return function2.calculate(x, accuracy);
        } else {
            return function1.calculate(x, accuracy);
        }
    }

    public boolean odz(double x) {
        //todo
        return false;
    }
}
