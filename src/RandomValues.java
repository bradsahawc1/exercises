
public class RandomValues {

    /*
     * You must understand this code
     */
    public static double getRandomValue(double from, double to) {
        return from + Math.random() * (to - from);
    }
    
    /* 
     * Don't worry about this code, you will learn this code in algorithm chapters.
     */
    public static void testRandomGenerator(double from, double to) {
        final int SIZE = 10000;
        double[] values = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = getRandomValue(from, to);
        }
        double minimum = Integer.MAX_VALUE;
        double maximum = Integer.MIN_VALUE; 
        for (double value: values) {
            if (minimum > value) minimum = value;
            if (maximum < value) maximum = value;
        }
        System.out.print("Minimum: " + minimum);
        System.out.println(" - Maximum: " + maximum);
    }
    
    public static void main(String[] args) {
        testRandomGenerator(210, 500);
        testRandomGenerator(1, 5);
        testRandomGenerator(123456, 5434334);
    }
}

/** Copy results here
 Minimum: 210.0367967395263 - Maximum: 499.99878518381934
 Minimum: 1.000168161068867 - Maximum: 4.999832951029136
 Minimum: 123627.67194213005 - Maximum: 5434324.830466164
*/
