
public class LinearSearch {
    public static int linearSearch1(int n, int[] array) {
        int i = 0;
        int l = array.length;
        
        while (i < l) {
            if (array[i] == n) { return i; }
            i++;
        }
        return -1;
    }
    public static int linearSearch2(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) { return i; }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {10, 3, 1, 2, 5};
        System.out.println("1.1: " + (0 == linearSearch1(10, array)));
        System.out.println("1.2: " + (1 == linearSearch1(3, array)));
        System.out.println("1.3: " + (2 == linearSearch1(1, array)));
        System.out.println("1.4: " + (-1 == linearSearch1(100, array)));
        
        System.out.println("1.5: " + (0 == linearSearch2(10, array)));
        System.out.println("1.6: " + (1 == linearSearch2(3, array)));
        System.out.println("1.7: " + (2 == linearSearch2(1, array)));
        System.out.println("1.8: " + (-1 == linearSearch2(100, array)));
    }
}

/*
You should have all trues
-----------------------
1.1: true
1.2: true
1.3: true
1.4: true
1.5: true
1.6: true
1.7: true
1.8: true
*/
