public class TwoDimensionalArray {
    public static void twoDimensionalArray1() {
        double[][] array = {{1,2}, {3,4}};
        System.out.println("1.1: " + (array.length == 2));
        System.out.println("1.2: " + (array[0].length == 2));
        System.out.println("1.3: " + (array[1].length == 2));
    }
    
    public static void twoDimensionalArray2() {
        double[][] array = new double[2][2];
        array[0] = new double[2]; array[0][0] = 1; array[0][1] = 2;
        array[1] = new double[2]; array[1][0] = 3; array[1][1] = 4;
        System.out.println("1.4: " + (array.length == 2));
        System.out.println("1.5: " + (array[0].length == 2));
        System.out.println("1.6: " + (array[1].length == 2));
    }
    
    public static void twoDimensionalArrayRagged1() {
        double[][] array = {{1}, {2,3}, {4,5,6}};
        System.out.println("1.7: " + (array.length == 3));
        System.out.println("1.8: " + (array[0].length == 1));
        System.out.println("1.9: " + (array[1].length == 2));
        System.out.println("1.10: " + (array[2].length == 3));
    }
    
    public static void twoDimensionalArrayRagged2() {
        double[][] array = new double[3][]; // You don't need to fill in the last []
        array[0] = new double[1]; array[0][0] = 1;
        array[1] = new double[2]; array[1][0] = 2; array[1][1] = 3;
        array[2] = new double[3]; array[2][0] = 4; array[2][1] = 4; array[2][2] = 6;
        System.out.println("1.11: " + (array.length == 3));
        System.out.println("1.12: " + (array[0].length == 1));
        System.out.println("1.13: " + (array[1].length == 2));
        System.out.println("1.14: " + (array[2].length == 3));
    }
    
    public static void main(String[] args) {
        twoDimensionalArray1();
        twoDimensionalArray2();
        twoDimensionalArrayRagged1();
        twoDimensionalArrayRagged2();
    }
}

/*
You should have all trues
-----------------------
1.1: true
1.2: true
1.3: true
1.4: true
1.5: true
1.6: true
1.7: true
1.8: true
1.9: true
1.10: true
1.11: true
1.12: true
1.13: true
1.14: true
*/
