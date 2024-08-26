import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        int z = x + y;
        System.out.print("\nz = " + z);
    }
}

/*
Enter x: 5
Enter y: 5

z = 10
 */