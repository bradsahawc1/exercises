
public class Sum {
    public static double sumWithFor() {
        double iarray[] = {1.0,2.0,3.0,4.0,5.0};
        double sum = 0.0;
        for (int i = 0; i < iarray.length; i++) { // if we use i <= iarray.length, it will cause offset by one error
            sum += iarray[i];
        }
        return sum;
    }

    public static double sumWithForEach() {
        double iarray[] = {1.0,2.0,3.0,4.0,5.0};
        double sum = 0.0;
        for (double e: iarray) {
            sum += e;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("1.1: " + ((15.0) == sumWithFor()));
        System.out.println("1.2: " + ((15.0) == sumWithForEach())); // This is dangerous code, but OK for checking values
    }
}
/*
You should have all trues
-----------------------
1.1: true
1.2: true
*/
