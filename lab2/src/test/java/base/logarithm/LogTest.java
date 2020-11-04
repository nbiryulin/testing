package base.logarithm;

import base.Calc;
import base.trigonometry.Cot;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogTest {


    @ParameterizedTest
    @CsvSource({
            "-1.0, NaN", "-0.001, NaN", "0.0, NaN", "0.01, -4.605170185988091", "1.0, 0.0", "2.718281828459045, 1.0", "7.3890560989306495, 2.0", "5.0, 1.6094379124341003"
    })
    public void testLn(Double x, Double exp){
        Ln calc = new Ln();
        test(calc, x, exp);
    }
    
    private void test(Calc calc, Double x, Double exp){
        assertEquals(exp, calc.calculate(x, 0.001), 0.001);
    }
}
