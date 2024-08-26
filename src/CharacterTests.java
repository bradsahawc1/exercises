public class CharacterTests {
    public static void characterTest1() {
        int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51 
        System.out.println("1.1 " + (i == (50 + 51)));
        int j = 2 + 'a'; // (int)'a' is 97 
        System.out.println("1.2 " + (j == (2 + 97)));
    }
    
    public static String characterComparison(char ch) {
        if (ch >= 'A' && ch <= 'Z')  return(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z') return (ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9') return (ch + " is a numeric character");
        else return (ch + " is not a normal character");
    }
    
    public static void characterTest2() {
        System.out.println("2.1 " + (characterComparison('A').equals("A is an uppercase letter")));
        System.out.println("2.2 " + (characterComparison('a').equals("a is a lowercase letter")));
        System.out.println("2.3 " + (characterComparison('1').equals("1 is a numeric character")));
        System.out.println("2.4 " + (characterComparison('\n').equals("\n is not a normal character")));
    }
    
    public static void characterTest3() {
        System.out.println("3.1 " + (Character.isDigit('a') == false));
        System.out.println("3.2 " + (Character.isLetter('a') == true));
        System.out.println("3.3 " + (Character.isLowerCase('a') == true));
        System.out.println("3.4 " + (Character.isUpperCase('a') == false));
        System.out.println("3.5 " + (Character.toLowerCase('T') == 't'));
        System.out.println("3.6 " + (Character.toUpperCase('q') == 'Q'));
    }
    
    public static void main(String[] args) {
        characterTest1();
        characterTest2();
        characterTest3();
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
 3.5 true
 3.6 true
*/
