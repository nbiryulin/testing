package base.trigonometry;

import base.Calc;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTest {
    

    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, 1.2246467991473532E-16", "1.5707963267948966, 1.0", "0.7853981633974483, 0.7071067811865475", "0.0, 0.0"
    })
    public void testSin(Double x, Double exp){
        Sin sin = new Sin();
        test(sin, x, exp);
    }


    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, -1.0", "1.5707963267948966, 6.123233995736766E-17", "0.7853981633974483, 0.7071067811865476", "0.0, 1.0"
    })
    public void testCos(Double x, Double exp){
        Cos cos = new Cos();
        test(cos, x, exp);
    }

    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, -1.2246467991473532E-16", "1.5707963267948966, NaN", "0.7853981633974483, 0.9999999999999999", "0.0, 0.0", "-3.141592653589793, 1.2246467991473532E-16", "-1.5707963267948966, NaN", "-0.7853981633974483, -0.9999999999999999"
    })
    public void testTan(Double x, Double exp){
        Tan tan = new Tan();
        test(tan, x, exp);
    }
    
    
   
    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, NaN", "1.5707963267948966, 6.123233995736766E-17", "0.7853981633974483, 1.0000000000000002", "0.0, NaN", "-3.141592653589793, NaN", "-1.5707963267948966, -6.123233995736766E-17", "-0.7853981633974483, -1.0000000000000002"
    })
    public void testCot(Double x, Double exp){
        Cot calc = new Cot();
        test(calc, x, exp);
    }

    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, NaN", "1.5707963267948966, 1.0", "0.7853981633974483, 1.4142135623730951", "0.0, NaN", "-3.141592653589793, NaN", "-1.5707963267948966, -1.0", "-0.7853981633974483, -1.4142135623730951"
    })
    public void testCsc(Double x, Double exp){
        Csc calc = new Csc();
        test(calc, x, exp);
    }


    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, -1.0", "1.5707963267948966, NaN", "0.7853981633974483, 1.417213562373095", "0.0, 1.0", "-3.141592653589793, -1.0", "-1.5707963267948966, NaN", "-0.7853981633974483, 1.414213562373095"
    })
    public void testSec(Double x, Double exp){
        Sec calc = new Sec();
        test(calc, x, exp);
    }
    
    
    private void test(Calc calc, Double x, Double exp){
        assertEquals(exp, calc.calculate(x, 0.01), 0.01);
    }
}
