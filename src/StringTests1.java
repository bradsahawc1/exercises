
public class StringTests1 {
    public static void stringTest1() {
        System.out.println("1.1 " + ("Hello".length() == 5));
        System.out.println("1.2 " + ("Wd".length() == 2));
    }
    
    public static void stringTest2() {
        System.out.println("2.1 " + ("hello".toUpperCase().equals("HELLO"))); 
        System.out.println("2.2 " + ("HELLO".toLowerCase().equals("hello"))); 
        System.out.println("2.3 " + ("hello".charAt(0) == 'h'));
        System.out.println("2.4 " + ("hello".charAt(1) == 101));  // 'e' is ASCII code 101
    }
    
    public static void stringTest3() {
        String message = "Welcome to Java";
        String message2 = message + "     \t \t ";
        System.out.println("3.1 " + (message.equals("Welcome to Java")));
        System.out.println("3.2 " + (message == "Welcome to Java")); // Don't use this one even though it returns true
        System.out.println("3.3 " + (message + "?").equals("Welcome to Java?"));
        System.out.println("3.4 " + (message2.trim().equals(message))); // what's the name of the method that trims the string?
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
 2.1 true
 2.2 true
 2.3 true
 2.4 true
 3.1 true
 3.2 true
 3.3 true
 3.4 true
 */
