import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Please input -1 to quit");
            userInput = input.nextInt();
        } while (userInput != -1); // What should be the value?
        System.out.println("Bye");
    }
}

/**
 * Output
 Please input -1 to quit
 1
 Please input -1 to quit
 2
 Please input -1 to quit
 -1
 Bye
 */