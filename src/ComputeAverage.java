import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAverage {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter three numbers
    System.out.print("Enter three numbers: ");
    double number1 = input.nextInt();
    double number2 = input.nextInt();
    double number3 = input.nextInt();

    input.close();

    // Compute average
    double average = (number1 + number2 + number3) / 3.0;

    // Display result
    System.out.println("The average of " + number1 + " " + number2
            + " " + number3 + " is " + average);
  }
}

/** Copy your output here
 *
 Enter three numbers: 3
 3
 3
 The average of 3.0 3.0 3.0 is 3.0

 Process finished with exit code 0
 */