public class BinarySearch {
    public static int binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
      
        while (high >= low) {
            int mid = (low + high) / 2; 
            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 10, 20};
        System.out.println("1.1: " + (0 == binarySearch(1, array)));
        System.out.println("1.2: " + (1 == binarySearch(2, array)));
        System.out.println("1.3: " + (2 == binarySearch(5, array)));
        System.out.println("1.4: " + (-1 == binarySearch(100, array)));
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
