public class Sorting {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Enter three numbers
        System.out.print("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("The sorted numbers are "
                + number1 + " " + number2 + " " + number3);
    }
}

/**
 * Enter three integers: 120 15 20
 * The sorted numbers are 15 20 120
 Enter three integers: 120
 15
 20
 The sorted numbers are 15 20 120

 Enter three integers: 20
 15
 120
 The sorted numbers are 15 20 120

 Enter three integers: 15
 120
 20
 The sorted numbers are 15 20 120

 Enter three integers: 120
 20
 15
 The sorted numbers are 15 20 120
 */