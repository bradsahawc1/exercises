
public class WhileLoop {

    public static void method1() {
        int i = 0;
        int count = 3;
        
        while (i < count) {
            System.out.printf("%d is smaller than %d : %b\n", i, count, i < count);
            // what is the statement?
            i++;
        }
        System.out.println("Done");
        System.out.printf("%d is **not** smaller than %d : %b\n", i, count, !(i < count));
    }
    
    public static void method2() {
        int i = 1;
        int count = 3;
        
        while (i <= count) {
            System.out.printf("%d is equal or smaller than %d : %b\n", i, count, i <= count);
            i++;
        }
        System.out.println("Done");
        System.out.printf("%d is **not** equal or smaller than %d : %b\n", i, count, !(i <= count));
    }
    
    public static void main(String[] args) {
        System.out.println("0 to 3 (3 not included) - Preferred method");
        method1();
        // 2nd output
        System.out.println("\n\n1 to 3 (3 included)");
        method2();
    }
}

/**
 * Output
 0 to 3 (3 not included) - Preferred method
 0 is smaller than 3 : true
 1 is smaller than 3 : true
 2 is smaller than 3 : true
 Done
 3 is **not** smaller than 3 : true


 1 to 3 (3 included)
 1 is equal or smaller than 3 : true
 2 is equal or smaller than 3 : true
 3 is equal or smaller than 3 : true
 Done
 4 is **not** equal or smaller than 3 : true
 */