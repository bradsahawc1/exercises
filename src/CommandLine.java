/*
 * 1. Right click on "CommandLine.java" and select "Run As" and "Run configurations"
 * 2. Open (x) = Arguments tab and give arguments "A B C"
 * 3. This mimics the command line operation "java CommandLine A B C" in an Eclipse
 */

public class CommandLine {
    public static void main(String[] args) {
        System.out.println("You give " + args.length + " arguments");
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}

/*
Copy your input and output.
You give 3 arguments
A
B
C
*/