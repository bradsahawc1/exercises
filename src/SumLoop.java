public class SumLoop {

    public static int sum1(int from, int to) {
        int sum = 0, i = from;
        while (i < (to + 1)) {
            sum += i;
            i++;
        }
        return sum;
    }
    
    public static int sum2(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("1: " + (sum1(1, 9) == 45));
        System.out.println("2: " + (sum1(1, 100) == 5050));
        System.out.println("3: " + (sum1(1, 9) == sum2(1, 9)));
        System.out.println("4: " + (sum1(1, 100) == sum2(1, 100)));
    }
}
/**
 * Output
 1: true
 2: true
 3: true
 4: true
 */
