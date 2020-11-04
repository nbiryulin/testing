package base.logarithm;

import base.Calc;
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

    @ParameterizedTest
    @CsvSource({
            "-1.0, NaN", "-0.001, NaN", "0.0, NaN", "0.01, -2.0", "1.0, 0.0", "2.718281828459045, 0.4342944819032518", "10.0, 1.0", "100.0, 2.0"
    })
    public void testLog10(Double x, Double exp){
        Log10 calc = new Log10();
        test(calc, x, exp);
    }


    @ParameterizedTest
    @CsvSource({
            "-1.0, NaN", "-0.001, NaN", "0.0, NaN", "0.01, -6.643856189774724", "1.0, 0.0", "2.718281828459045, 1.4426950408889634", "2.0, 1.0", "4.0, 2.0"
    })
    public void testLog2(Double x, Double exp){
        Log2 calc = new Log2();
        test(calc, x, exp);
    }

    @ParameterizedTest
    @CsvSource({
            "-1.0, NaN", "-0.001, NaN", "0.0, NaN", "0.01, -2.861353116146786", "1.0, 0.0", "2.718281828459045, 0.6213349345596119", "5.0, 1.0", "125.0, 3.0"
    })
    public void testLog5(Double x, Double exp){
        Log5 calc = new Log5();
        test(calc, x, exp);
    }
    
    private void test(Calc calc, Double x, Double exp){
        assertEquals(exp, calc.calculate(x, 0.01), 0.01);
    }
}
