public class PassByValue {
    
    public static void swap(int n1, int n2) {
        System.out.println("2: " + (n1 == 1 && n2 == 2));
     
        // Swap n1 with n2
        int temp = n1; 
        n1 = n2;
        n2 = temp;
        System.out.println("3: " + (n1 == 2 && n2 == 1));
    }

    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 1; 
        int num2 = 2;
        System.out.println("1: " + (num1 == 1 && num2 == 2));
        // Invoke the swap method to attempt to swap two variables
        swap(num1, num2);
        System.out.println("4: " + (num1 == 1 && num2 == 2));
    }
}

/* 
 * Copy Output
1: true
2: true
3: true
4: true
 */