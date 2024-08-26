import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month (first three letters with the first letter in uppercase): ");
        String month = input.next();

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            System.out.print(month + " " + year + " has 31 days.");
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            System.out.print(month + " " + year + " has 30 days.");
        } else if (month.equals("Feb")) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                int day = 29;
                System.out.print(month + " " + year + " has " + day + " days.");
            } else {
                int day = 28;
                System.out.print(month + " " + year + " has " + day + " days.");
            }
        }
    }
}

/**
 Enter a year: 2001
 Enter a month (first three letters with the first letter in uppercase): Jan
 Jan 2001 has 31 days.

 Enter a year: 2000
 Enter a month (first three letters with the first letter in uppercase): Feb
 Feb 2000 has 29 days.
 */