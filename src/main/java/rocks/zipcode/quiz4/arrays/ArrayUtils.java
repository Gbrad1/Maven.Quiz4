package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middleIndex = values.length/2;
        return values[middleIndex];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] buffer = new String[values.length - 1];
        int count = 0;
        int middleIndex = values.length/2;
        for (int i = 0; i < values.length; i++) {
            if (i != middleIndex) {
                buffer[count++] = values[i];
            }
        }
        return buffer;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] buffer = new String[values.length - 1];
        int count = 0;
        int lastIndex = values.length - 1;
        for (int i = 0; i < values.length; i++) {
            if (i != lastIndex) {
                buffer[count++] = values[i];
            }
        }
        return buffer;
    }
}