
public class StringTests2 {
    
    public static void stringTest1() {
        String message = "Welcome to Java Welcome"; // second welcome is in 16th location
        System.out.println("1.1 " + (message.substring(0, 2).equals("We")));
        System.out.println("1.2 " + (message.indexOf("Welcome") == 0));
        System.out.println("1.3 " + (message.lastIndexOf("Welcome") == 16));
    }
    
    public static void stringTest2() {
        String intValue = "123";
        System.out.println("2.1 " + (Integer.parseInt(intValue) == 123));
        String doubleValue = "12.34"; // This is dangerous
        System.out.println("2.2 " + (Double.parseDouble(doubleValue) == 12.34));
    }
    
    public static void stringTest3() {
        int count = 5;
        double amount = 45.56;
        System.out.println("3.1 " + (String.format("count is %d and amount is %4.2f", count, amount).equals("count is 5 and amount is 45.56")));
        boolean b = true;
        System.out.println("3.2 " + (String.format("%b - cool?", b).equals("true - cool?")));
    }
    
    public static void main(String[] args) {
        stringTest1();
        stringTest2();
        stringTest3();
    }
}

/** Copy results here
 1.1 true
 1.2 true
 1.3 true
 2.1 true
 2.2 true
 3.1 true
 3.2 true
*/