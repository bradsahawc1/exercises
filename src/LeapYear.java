public class LeapYear {

    public static String isLeapYear(int year) {
        return  ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? "leap year" : "not leap year";
    }
    public static void main(String[] args) {
        System.out.println("1: " + isLeapYear(2004).equals("leap year"));
        System.out.println("2: " + isLeapYear(2000).equals("leap year"));
        System.out.println("3: " + isLeapYear(2100).equals("not leap year"));
        System.out.println("4: " + isLeapYear(2001).equals("not leap year"));
        System.out.println("5: " + isLeapYear(2004).equals("leap year"));
    }
}
/* Output:
1: true
2: true
3: true
4: true
5: true
*/