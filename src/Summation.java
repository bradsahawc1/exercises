import java.util.Scanner;

public class Summation {
    public static double sum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (Math.sqrt(i - 1) + Math.sqrt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n? ");
        int n = input.nextInt();
        double result = sum(n);
        System.out.println("The result:" + result);
    }
}

/*
 * Output
n?
1
The result:1.0

n?
100
The result:10.000000000000004
 */