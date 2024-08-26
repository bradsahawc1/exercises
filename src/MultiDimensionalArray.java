
public class MultiDimensionalArray {
    public static double getSum(double[] scores) {
        double result = 0.0;
        for (double value: scores)
            result += value;
        return result;
    }
    public static double getSum2D(double[][] scores) {
        double result = 0.0;
        for (double value[]: scores) {
            result += getSum(value); // without getSum, you should use nested loop
        }
        return result;
    }
    public static double getAverageScoreForExam(double[] scores) {
        return getSum(scores)/scores.length;
    }
    public static double getAverageScoreForStudent(double[][] scores) {
        double count = 0;
        for (double[] value: scores) {
            count += value.length;
        }
        return getSum2D(scores)/count;
    }
    public static double getAverageScore(double[][][] scores) {
        double result = 0.0;
        double count = 0;
        for (double[][] value: scores) {
            result += getSum2D(value);
        }
        for (double[][] values: scores) {
            for (double[] value: values) {
                count += value.length;
            }
        }
        return result/count;
    }
    
    public static void multiDimensionalArray() {
        double[][][] scores = {
                {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}}, 
                {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}}, 
                {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}}, 
                {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}}, 
                {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}}, 
                {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}};
        
        System.out.println("1.1 :" + (scores.length == 6)); // 6 students
        System.out.println("1.2 :" + (scores[0].length == 5)); //each student has 5 courses
        System.out.println("1.3 :" + (scores[0][0].length == 2)); //each course has 2 results
    
        // Get average of the first student's first course.
        System.out.println("1.4 :" + (getAverageScoreForExam(scores[0][0]) == (7.5+20.5)/2)); // this is dangerous code, but it's OK as it's simple arithmetic
        // Get average of the first student
        double value = (7.5 + 20.5 + 9.0 + 22.5 + 15 + 33.5 + 13 + 21.5 + 15 + 2.5)/10;
        System.out.println("1.5 :" + (getAverageScoreForStudent(scores[0]) == value));
        // Get average of every student
        //System.out.println(getAverageScore(scores));
        System.out.println("1.6 :" + (getAverageScore(scores) == 17.16));
    }
    public static void main(String[] args) {
        multiDimensionalArray();
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
1.9: true
1.10: true
1.11: true
1.12: true
1.13: true
1.14: true
*/
