package base;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface Calc {

    public double calculate(double x, double accuracy);

    boolean odz(double x);

    default public double[] generate(double from, double step) {
        double[] a = new double[10];
        a[0] = from;
        for (int i = 1; i < 9; i++) {
            from = from + step;
            a[i] = from;
        }
        return a;
    }

    default public void printToCsv(double from, double step, double accuracy) throws IOException {
        Map<Double, Double> result = new HashMap<>();
        double[] x = generate(from, step);
        for (double a : x) {
            result.put(a, calculate(a, accuracy));
        }
        printToCsv(result);
    }

    default public void printToCsv(Map<Double, Double> map) throws IOException {
        String[] HEADERS = {"X", "Результаты модуля (X)"};
        FileWriter out = new FileWriter("results.csv");
        try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT
                .withHeader(HEADERS))) {
            map.forEach((x, y) -> {
                try {
                    printer.printRecord(x, y);
                } catch (IOException e) {
                    System.out.println("Cannot print to csv file");
                }
            });
        }
    }


}
