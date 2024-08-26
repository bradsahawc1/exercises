public class Reverse {
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i] = list[list.length - (i + 1)];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
        for (int result: list2) {
            System.out.println(result);
        }
    }
}
/*
Copy output here:
6
5
4
3
2
1
 */