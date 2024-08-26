public class SummingElements {
    public static int summingColumns(int[][] matrix, int column) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][column];
        }
        return sum;
    }

    public static int summingRows(int[][] matrix, int row) {
		// use summingColumns to implement this method
        int sum = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            sum += matrix[row][column];
        }
        return sum;
    }
	
    public static int summingAllElements(int[][] matrix) {
		// you need a nested for loop to get the summation of all elements
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
		    for (int column = 0; column < matrix[row].length; column++) {
		        sum += matrix[row][column];
            }
        }
		return sum;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2}, {3,4}, {5,6}, {7, 8}, {9, 10}};
        int result = summingAllElements(matrix1);
        System.out.println(result == (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10));
        // sum of 0th column elements
        result = summingColumns(matrix1, 0);
        System.out.println(result == (1 + 3 + 5 + 7 + 9));
        // sum of 0th row elements
        result = summingRows(matrix1, 0);
        System.out.println(result == (1 + 2));
    }
}
/* output
true
true
true



 */