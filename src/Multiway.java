public class Multiway {
    /*
     * if score is more than 90, return A
     * 80, B
     * 70, C
     * 60, D
     * otherwise, F
     */
    public static String getScore(int score) {
        if (score >= 90.0) return "A";
        else if (score >= 80.0) return "B";
        else if (score >= 70.0) return "C";
        else if (score >= 60.0) return "D";
        else return "F";



    }
    
    public static void main(String[] args) {
        System.out.println("1: " + getScore(95).equals("A"));
        System.out.println("2: " + getScore(85).equals("B"));
        System.out.println("3: " + getScore(75).equals("C"));
        System.out.println("4: " + getScore(65).equals("D"));
        System.out.println("5: " + getScore(55).equals("F"));
        System.out.println("6: " + getScore(100).equals("A"));
    }
}
/* Output:
1: true
2: true
3: true
4: true
5: true
6: true
*/