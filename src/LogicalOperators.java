public class LogicalOperators {
    public static void andTest() {
        System.out.println("1.1 " + ((true && true) == true));
        System.out.println("1.2 " + ((true && false) == false));
        System.out.println("1.3 " + ((false && true) == false));
        System.out.println("1.4 " + ((false && false) == false));
    }
    
    public static void orTest() {
        System.out.println("2.1 " + ((true || true) == true));
        System.out.println("2.2 " + ((true || false) == true));
        System.out.println("2.3 " + ((false || true) == true));
        System.out.println("2.4 " + ((false || false) == false));
    }
    
    public static void notTest() {
        System.out.println("3.1 " + ((!true) == false));
        System.out.println("3.2 " + ((!false) == true));
    }
    
    public static void xorTest() {
        System.out.println("4.1 " + ((true ^ true) == false));
        System.out.println("4.2 " + ((true ^ false) == true));
        System.out.println("4.3 " + ((false ^ true) == true));
        System.out.println("4.4 " + ((false ^ false) == false));
    }
    
    public static void main(String[] args) {
        andTest();
        orTest();
        notTest();
        xorTest();
    }
}

/* Output:
1.1 true
1.2 true
1.3 true
1.4 true
2.1 true
2.2 true
2.3 true
2.4 true
3.1 true
3.2 true
4.1 true
4.2 true
4.3 true
4.4 true
*/