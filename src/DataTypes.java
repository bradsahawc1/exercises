
public class DataTypes {

    public static void testPrimitiveTypes() {
        int x = 10;
        System.out.println("1: " + (x == 10));

        x = Integer.MIN_VALUE; // What is the value of Integer.MIN_VALUE?
        System.out.println("2: " + (x == -2147483648));

        long x2 = 1234567890123L;
        System.out.println("3: " + (x2 == 1234567890123L));

        boolean z = true;
        System.out.println("4: " + (z == true));
    }

    public static void CastingTest() {
        int x = 10;
        int y = 20;
        System.out.println("5: " + (0.5 != x / y));
        System.out.println("6: " + (0.5 == (double) x / y));
    }


    public static void main(String[] args) {
        testPrimitiveTypes();
        CastingTest();
    }
}

/*
1: true
2: true
3: true
4: true
5: true
6: true
 */
