import java.util.Random;
import java.util.Date;

public class JavaUtilities {
    public static void dateTest() {
        java.util.Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " milliseconds"); 
        System.out.println(date.toString());
    }
    
    public static void randomTest() {
        Random random1 = new Random();
        System.out.print("From random1: "); 
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(35);
        System.out.print("\nFrom random2: "); 
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }
    
    public static void main(String[] args) {
        dateTest();
        randomTest();
    }
}

/**
 * output
 Wed Nov 20 13:03:23 EST 2019
 From random1: 325 311 809 578 199 501 773 656 589 147
 From random2: 752 43 166 175 852 271 257 594 996 840
 Process finished with exit code 0
 */
