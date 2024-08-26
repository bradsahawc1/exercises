
public class FindMinMax {
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        // We can use foreach loop
        for (int value: array) {
            if (value > max) max = value;
        }
        return max;
    }
    
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        // We can use foreach loop
        for (int value: array) {
            if (value < min) min = value;
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] array = {5,1,4,7,3};
        System.out.println("1.1: " + (findMax(array) == 7));
        System.out.println("1.2: " + (findMin(array) == 1));
        int[] array2 = {-4,11,5,1,4,7,3};
        System.out.println("1.3: " + (findMax(array2) == 11));
        System.out.println("1.4: " + (findMin(array2) == -4));
    }
}

/*
You should have all trues
-----------------------
1.1: true
1.2: true
1.3: true
1.4: true
*/
