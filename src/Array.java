
public class Array {

    public static void initialization1() {
        // initialize the array with value 1,2,3,4,5
        int[] iarray = {1,2,3,4,5};
        System.out.println("1.1: " + (iarray.length == 5));
        System.out.println("1.2: " + (iarray[0] == 1));
        System.out.println("1.3: " + (iarray[3] == 4));
        System.out.println("1.4: " + (iarray[iarray.length - 1] == 5));
    }
    public static void initialization2() {
        // initialize the array with value 1,2,3,4,5
        int[] iarray = new int[5]; // {1,2,3,4,5};
        iarray[0] = 1; iarray[1] = 2; iarray[2] = 3; iarray[3] = 4; iarray[4] = 5;
        System.out.println("2.1: " + (iarray.length == 5));
        System.out.println("2.2: " + (iarray[0] == 1));
        System.out.println("2.3: " + (iarray[3] == 4));
        System.out.println("2.4: " + (iarray[iarray.length - 1] == 5));
    }
    
    public static void main(String[] args) {
        initialization1();
        initialization2();
    }

}
/*
You should have all trues
-----------------------
1.1: true
1.2: true
1.3: true
1.4: true
2.1: true
2.2: true
2.3: true
2.4: true
*/