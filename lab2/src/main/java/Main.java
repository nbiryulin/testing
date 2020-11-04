import base.logarithm.Ln;
import base.logarithm.Log2;
import base.trigonometry.Cos;
import base.trigonometry.Csc;
import base.trigonometry.Sin;
import functions.Function1;
import functions.Function2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
         *
         * TODO
         *
         * - write to csv
         *
         * - odz everywhere ------------------------------------------ done
         *
         * - write it tests with mocks
         *
         * - equals analyze
         *
         *
         */
        Sin sin = new Sin();
        Csc scs= new Csc();
        Cos cos = new Cos();
//
//        System.out.println(sin.calculate(Math.PI/6, 0.001));
//        System.out.println(scs.calculate(Math.PI/6, 0.001));
//        System.out.println(cos.calculate(Math.PI/6, 0.001));
//
//
//        System.out.println(sin.calculate(Math.PI, 0.001));
//        System.out.println(scs.calculate(Math.PI, 0.001));
//        System.out.println(cos.calculate(Math.PI, 0.001));
//
//        System.out.println(sin.calculate(0, 0.001));
//        System.out.println(scs.calculate(0, 0.001));
//        System.out.println(cos.calculate(0, 0.001));
//
//        System.out.println(sin.calculate(Math.PI/2, 0.001));
//        System.out.println(scs.calculate(Math.PI/2, 0.001));
//        System.out.println(cos.calculate(Math.PI/2, 0.001));
//        Ln ln = new Ln();
//        System.out.println(ln.calculate(1, 0.001));
//        Log2 log2 = new Log2();
//        System.out.println(log2.calculate(2, 0.001));

//        Function1 f = new Function1();
//        System.out.println(f.calculate(-Math.PI, 0.01));
//        f.printToCsv(-Math.PI, Math.PI/4, 0.01);
        
        
        
        List<String> res = new ArrayList<>();
//        String s =  a(Math.PI);
//        res.add(s);
//        s = a(Math.PI/2);
//        res.add(s);
//        s = a(Math.PI/4);
//        res.add(s);
//        s = a(0.0);
//        res.add(s);
//        s =  a(-Math.PI);
//        res.add(s);
//        s = a(-Math.PI/2);
//        res.add(s);
//        s = a(-Math.PI/4);
//        res.add(s);


        String s =  a(-1.0);
        res.add(s);
        s = a(-0.001);
        res.add(s);
        s = a(0.0);
        res.add(s);
        s = a(0.01);
        res.add(s);
        s =  a(1.0);
        res.add(s);
        s = a(Math.E);
        res.add(s);
        s = a(5.0);
        res.add(s);
        s = a(125.0);
        res.add(s);

        
        
        System.out.println(res);
//        System.out.println(Math.PI);
//        System.out.println(Math.PI/4);
//        System.out.println(Math.PI/2);
          }
          private static String a(Double b){
              Function2 function2 = new Function2();
            return "\"" + b + ", " + Math.log(b)/ Math.log(5) + "\"" ;
          }
}
