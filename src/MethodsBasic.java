// Uncomment this. You teach Java to find the DecimalFormat object 
// in java/text of "JRE System Library" using "import"
import java.text.DecimalFormat;

class OtherMethod {
    // DEFINE A METHOD
    // define a static method that sums from x to y
    // (1) You know this is a [Static] method. So, you don't need to [instantiate] this.
    // (2) The method [sum] has two [parameters]: x of type [int] and y of type [int]
    public static int sum(int x, int y) {
        int result = 0;
        for (int i = x; i <= y; i++) {
            result += i;
        }
        return result;
    }
}

public class MethodsBasic {
    public static void main(String[] args) {
        // INVOKE A METHOD (STATIC)
        // (3) You [invoke] the sum method without [instantiation], because the sum method is [static].
        // (4) The static method is in the class [OtherMethod], so you should prepend the name
        //     before you use the method. 
        // (5) You give [arguments] 1 and 100, both of type [int], to the method sum.
        int result = OtherMethod.sum(1, 100); // 1 + ... + 100 = 5050
        System.out.println("1: " + (result == 5050));
        
        // INVOKE A METHOD (DYNAMIC - YOU'LL LEARN MORE ABOUT THIS AT CH9 AND LATER)
        // (6) You need to use a method in an object (objects are **not** static.) 
        // (7) is up in the 1st line.
        // (8) You should [instantiate]: copy the class into a [heap] JVM memory.
        // (9) You use [new] operator to [instantiate] an [object].
        //     DecimalFormat is a class to format double type data---similar to printf or format.
        //     Instantiation is a part of Ch9 and later, so just familiarize yourselves with the name
        //     You use a **variable** "df" of type "DecimalFormat" to **reference** the **instantiated object**.
        DecimalFormat df = new DecimalFormat("$#,###.00"); // new operator is missing
        
        // (10) You invoke the format method in a class.
        double x = 123.456;
        System.out.println("2: " + "$123.46".equals(df.format(x)));
    }
}

/* 
 * Copy Output
1: true
2: true
 */

// DEFINE A METHOD
// define a static method that sums from x to y
// (1) You know this is a [static] method. So, you don't need to [instantiate] this.
// (2) The method [sum] has two [parameters]: x of type [int] and y of type [int]
// INVOKE A METHOD (STATIC)
// (3) You [invoke] the sum method without [instantiation], because the sum method is [static].
// (4) The static method is in the class [OtheMethod], so you should prepend the name
//     before you use the method. 
// (5) You give [arguments] 1 and 100, both of type [int], to the method sum.
// INVOKE A METHOD (DYNAMIC - YOU'LL LEARN MORE ABOUT THIS AT CH9 AND LATER)
// (6) You need to use a method in an object (objects are **not** static.) 
// (7) is up in the 1st line.
// (8) You should [instantiate]: copy the class into a [heap] JVM memory.
// (9) You use [new] operator to [instantiate] an [object]. 
//     DecimalFormat is a class to format double type data---similar to printf or format.
//     Instantiation is a part of Ch9 and later, so just familiarize yourselves with the name
//     You use a **variable** "df" of type "DecimalFormat" to **reference** the **instantiated object**.
// (10) You invoke the format method in a class.
