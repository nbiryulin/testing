package functions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {
    
    @ParameterizedTest
    @CsvSource({
            "0.0, NaN",
            "-3.141592653589793, NaN",
            "-1.5707963267948966, NaN",
            "-0.7853981633974483, 0.8898",
            "0.7853981633974483, 0.8898",
            "1.5707963267948966, NaN",
            "3.141592653589793, NaN",
            "-2.356, -6.885",
            "2.356, -6.885",
            "1.028, 1.043",
            "-1.028, 1.043"
    })
    public void testf1(Double x, Double exp) {
        Function1 function1 = new Function1();
        assertEquals(exp, function1.calculate(x, 0.0001), 0.01);
    }


    @ParameterizedTest
    @CsvSource({
            "0.0, NaN",
            "1.0, NaN",
            "0.1, 29.0667",
            "-0.01, NaN",
            "0.001, 2353.817",
            "1.001, 1.03196E-12",
            "0.999, 1.0361E-12",
            "0.5, 0.23869",
            "0.75, 0.00708245",
            "100, 465.050449058",
            "10, 29.066666"
    })
    
    public void testF2(Double x, Double exp) {
        Function2 function2 = new Function2();
        assertEquals(exp, function2.calculate(x, 0.0001), 0.01);
    }
}
