
public class MathFunctionsTests {
    public static void mathFunctions1() {
        System.out.println("1.1 " + !(Math.sin(Math.PI) == 0.0)); // Math.sin(Math.PI) is not 0! Check the '!' (not operator) 
        
        final double SMALL_VALUE = 1.0E-5;    
        System.out.println("1.2 " + (Math.abs(Math.sin(Math.PI) - 0.0) < SMALL_VALUE)); // sin(PI) == 0
        
        System.out.println("1.3 " + (Math.abs(Math.sqrt(4.0) - 2.0) < SMALL_VALUE)); // sqrt of 4.0 is 2.0
        System.out.println("1.4 " + (Math.abs(Math.exp(3.5) - 33.11545) < SMALL_VALUE)); // exp(3.5) == 33.11545
        System.out.println("1.5 " + (Math.abs(Math.log(3.5) - 1.25276) < SMALL_VALUE)); // log(3.5) == 1.25276
        System.out.println("1.6 " + (Math.abs(Math.log10(3.5) - 0.54406) < SMALL_VALUE)); // log10(3.5) == 0.544
        System.out.println("1.7 " + (Math.abs(Math.pow(2, 3) - 8.0) < SMALL_VALUE)); // 2^3 == 8
        System.out.println("1.8 " + (Math.abs(Math.pow(2.0, 3.0) - 8.0) < SMALL_VALUE)); // (2.0)^(3.0) == 8.0
    }
    
    public static void mathFunctions2() {
        System.out.println("2.1 " + (Math.ceil(2.1) == 3.0)); // ceil
        System.out.println("2.2 " + (Math.floor(2.1) == 2.0));
        System.out.println("2.3 " + (Math.floor(-2.1) == -3.0)); // floor
        System.out.println("2.4 " + (Math.rint(2.1) == 2.0));
        System.out.println("2.5 " + (Math.rint(-2.1) == -2.0)); // rint
        System.out.println("2.6 " + (Math.round(2.1) == 2L));   // round returns long
        System.out.println("2.7 " + (Math.round(2.6) == 3L)); // round
    }
    
    public static void mathFunctions3() {
        System.out.println("3.1 " + (Math.min(10.0, 20.0) == 10.0));
        System.out.println("3.2 " + (Math.max(10.0, 20.0) == 20.0));
    }
    
    public static void main(String[] args) {
        mathFunctions1();
        mathFunctions2();
        mathFunctions3();
    }
}

/** Copy results here
 1.1 true
 1.2 true
 1.3 true
 1.4 true
 1.5 true
 1.6 true
 1.7 true
 1.8 true
 2.1 true
 2.2 true
 2.3 true
 2.4 true
 2.5 true
 2.6 true
 2.7 true
 3.1 true
 3.2 true
 */

