public class EliminateDuplicates {
    public static int[] eliminateDuplicates(int[] numbers) {
        int[] temp = new int[6];
        int j = 0;
        temp[0] = numbers [0];
        for (int i = 0; i < numbers.length; i++) {
                int index = linearSearch(temp, numbers[i]);
                if (index == -1) {
                    j++;
                    temp[j] = numbers[i];
                }
            }
        int[] result = new int[temp.length];
        result = temp;
        return result;
    }

    /**
     * The method for finding a key in the list
     */
    public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
		return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten integers: ");

        for (int i = 0; i < numbers.length; i++) {
            // Read and store numbers in an array if it is new
            numbers[i] = input.nextInt();
        }

        int[] result = eliminateDuplicates(numbers);

        System.out.println(
                "The number of distinct integers is " + result.length);
        System.out.print("The distinct integers are ");
        for (int e : result)
            System.out.print(e + " ");
    }
}

/*
Enter ten integers: 1 2 3 2 1 6 3 4 5 2
The number of distinct integers is 6
The distinct integers are 1 2 3 6 4 5
 */