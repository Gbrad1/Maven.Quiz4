package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] squareRootsOfValues = new Double[value.length];
        for (int i = 0; i < squareRootsOfValues.length; i++) {
            squareRootsOfValues[i] = Math.sqrt(value[i]);
        }
        return squareRootsOfValues;
    }

    public static Double[] squares(Double... values) {
        Double[] squaredValues = new Double[values.length];
        for (int i = 0; i < squaredValues.length; i++) {
            squaredValues[i] = values[i] * values[i];
        }
        return squaredValues;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
