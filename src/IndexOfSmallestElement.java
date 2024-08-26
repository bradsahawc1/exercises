public class IndexOfSmallestElement {
    public static int IndexOfSmallestElement(int[] array) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        int[] list = {5,1,4,5,2};
        int res = IndexOfSmallestElement(list);
        System.out.printf("The smallest index is %d\n", res);
    }
}
/*
Copy output here:
The smallest index is 1
 */