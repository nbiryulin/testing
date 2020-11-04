package functions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Function1ItTest {
    
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
    public void f1(Double x, Double exp) {
        Function1 function1 = new Function1();
        assertEquals(exp, function1.calculate(x, 0.0001), 0.01);
    }


    @ParameterizedTest
    @CsvSource({
            "3.141592653589793, 1.7758174477548265",
            "1.5707963267948966, 0.04301221302138323",
            "0.7853981633974483, 0.003521885775204083",
            "0.0, NaN",
            "-3.141592653589793, NaN",
            "-1.5707963267948966, NaN",
            "-0.7853981633974483, NaN"
    })
    public void testF2(Double x, Double exp) {
        Function2 function2 = new Function2();
        assertEquals(exp, function2.calculate(x, 0.0001), 0.01);
    }



}
