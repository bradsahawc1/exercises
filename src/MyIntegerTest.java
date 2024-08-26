class MyInteger {
    private int value;

    public int getValue() {
    return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(MyInteger o) {
        return isPrime(o.getValue());
    }

    public boolean isEven() {
        return isEven(value);
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else return false;
    }

    public static boolean isEven(MyInteger o) {
        return isEven(o.getValue());
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        else return true;
    }

    public static boolean isOdd(MyInteger o) {
        return isOdd(o.getValue());
    }

    public boolean equals(int anotherNum) {
        return value == anotherNum;
    }

    public boolean equals(MyInteger o) {
        return value == o.getValue();
    }

    public static int parseInt(char[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * 10 + (numbers[i] - '0');
        }
        return result;
    }

    public static int parseInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
    }
}

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

/*
n1 is even? false
n1 is prime? true
15 is prime? false
3539
3539
n2 is odd? false
45 is odd? true
n1 is equal to n2? false
n1 is equal to 5? true
 */