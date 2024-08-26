
public class Gcd {

    public static int getGcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1 
        int k = 2; // Possible gcd

        do {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        } while (k <= n1 && k <= n2);
        return gcd;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("1: " + (getGcd(12, 10) == 2));
        System.out.println("2: " + (getGcd(18, 12) == 6));
        System.out.println("3: " + (getGcd(121, 11) == 11));
    }
}

/**
 * Output
 1: true
 2: true
 3: true
 */
