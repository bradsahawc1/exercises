public class BreakContinue {

    public static int breakMethod() {
        int sum = 0;
        // sum from 1 to 4, by breaking when i == 5
        for (int i = 0; i < 11; i++) {
            if (i == 5) break;
            sum += i;
        }
        return sum;
    }
    public static int continueMethod() {
        int sum = 0;
        // don't include i = 5
        for (int i = 0; i < 11; i++) {
            if (i == 5) continue;
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("1: " + (breakMethod() == 10));
        System.out.println("2: " + (continueMethod() == 50));
    }
}

/**
 * Output
 1: true
 2: true
 */
