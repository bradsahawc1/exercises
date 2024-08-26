import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a);
    }
}

/*
 Enter v0, v1, and t: 5.5
 50.9
 4.5
 The average acceleration is 10.088888888888889

 Process finished with exit code 0
 */