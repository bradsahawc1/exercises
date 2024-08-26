import java.util.Scanner;

public class SumAllDigits {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read a number
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        // Find all digits in number
        int lastDigit = number % 10;
        int remainingNumber = number / 10;
        int secondLastDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdLastDigit = remainingNumber % 10;

        // Obtain the sum of all digits
        int sum = lastDigit + secondLastDigit + thirdLastDigit;

        // Display results
        System.out.println("The sum of all digits in " + number
                + " is " + sum);
    }
}

/*
 Enter an integer between 0 and 1000: 999
 The sum of all digits in 999 is 27

 Enter an integer between 0 and 1000: 123
 The sum of all digits in 123 is 6
 */