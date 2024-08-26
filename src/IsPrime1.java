public class IsPrime1 {
    
    public static boolean isPrime1(int n) {
        int i = 2;
        boolean isPrime = true;
        while (n > i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println("1: " + isPrime1(2)); 
        System.out.println("2: " + isPrime1(3)); 
        System.out.println("3: " + !isPrime1(4));
        System.out.println("4: " + isPrime1(17));
        System.out.println("5: " + isPrime1(1021));
        System.out.println("6: " + !isPrime1(1024));
    }
}

/* 
 * Copy Output
1: true
2: true
3: true
4: true
5: true
6: true
 */