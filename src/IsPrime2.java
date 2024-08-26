public class IsPrime2 {
    
    public static boolean isPrime2(int n) {
        
        if (n <= 0) System.exit(0);
        if (n == 1) return true;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        int i = 2;
        boolean isPrime = true;
        while (n/2 > i) { // we can stop at a half. 
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println("1: " + isPrime2(2)); 
        System.out.println("2: " + isPrime2(3)); 
        System.out.println("3: " + !isPrime2(4));
        System.out.println("4: " + isPrime2(17));
        System.out.println("5: " + isPrime2(1021));
        System.out.println("6: " + !isPrime2(1024));
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