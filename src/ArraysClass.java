
public class ArraysClass {
    public static void arraysSortTest() {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5}; 
        java.util.Arrays.sort(numbers); // Sort the whole array 
        System.out.println("1.1 " + (numbers[0] == 1.9));
        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'}; 
        java.util.Arrays.sort(chars, 1, 3); // Sort part of the array java.util.Arrays.parallelSort(chars, 1, 3); // Sort part of the array
        System.out.println("1.2 " + (chars[0] == 'a'));
        System.out.println("1.3 " + (chars[1] == '4'));
    }
    public static void arraysSearchTest() {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int result1 = java.util.Arrays.binarySearch(list, 11);
        int result2 = java.util.Arrays.binarySearch(list, 12);
        System.out.println("2.1: " + (result1 == 4));
        System.out.println("2.2: " + (result2 < 0));
         
         char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'}; 
         int result3 = java.util.Arrays.binarySearch(chars, 'a'); 
         System.out.println("2.3: " + (result3 == 0));
         int result4 = java.util.Arrays.binarySearch(chars, 't');
         System.out.println("2.4: " + (result4 < 0));
         
    }
    
    public static void equalsTest() {
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10}; 
        System.out.println("3.1: " + java.util.Arrays.equals(list1, list2)); // true 
        System.out.println("3.2: " + !java.util.Arrays.equals(list2, list3));
    }
    
    public static void main(String[] args) {
        arraysSortTest();
        System.out.println();
        arraysSearchTest();
        System.out.println();
        equalsTest();
    }
}
/*
You should have all trues
-----------------------
1.1 true
1.2 true
1.3 true

2.1: true
2.2: true
2.3: true
2.4: true

3.1: true
3.2: true
*/