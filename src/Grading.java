/**
Write the static method `grading` that implements these requirements.

1. The input value can be any character, but we process only `A`,`B`,`C`,`D`,`E`, and `F` inputs.
2. Depending on the input, the two variables are assigned following the rules.
    * For `A`,`B`,`C`, the success variable is assigned to 1. For `D`,`E`,`F` the success variable is assigned to 0. Otherwise the success variable is assigned to -1. 
    * For `A`, outputString = "Excellent grade", For `B`, outputString = "Very good grade", For `C`, outputString = "Good grade". For `D`,`E`,`F`, outputString = "Low grade", for any other cases, outputString = "Invalid grade".
3. You must use `switch' statement.
4. You must use `fall through` and `default` (-2 deduction if you don't use any of them).
*/

public class Grading {

    public static String grading(char grade) {
        int success;
        String outputString;

        switch (grade) {
            case 'A':
                outputString = "Excellent grade";
                success = 1;
                break;
            case 'B':
                outputString = "Very good grade";
                success = 1;
                break;
            case 'C':
                outputString = "Good grade";
                success = 1;
                break;
            case 'D':
            case 'E':
            case 'F':
                outputString = "Low grade";
                success = 0;
                break;
            default:
                outputString = "Invalid grade";
                success = -1;

        }
        return outputString + success;
    }

    
    public static void main(String[] args) {
        System.out.println("1: " + grading('A').equals("Excellent grade1"));
        System.out.println("2: " + grading('B').equals("Very good grade1"));
        System.out.println("3: " + grading('C').equals("Good grade1"));
        System.out.println("4: " + grading('D').equals("Low grade0"));
        System.out.println("5: " + grading('E').equals("Low grade0"));
        System.out.println("6: " + grading('F').equals("Low grade0"));
        System.out.println("7: " + grading('X').equals("Invalid grade-1"));
    }
}

/* Output:
1: true
2: true
3: true
4: true
5: true
6: true
7: true
*/

