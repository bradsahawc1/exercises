
public class CallByReference {
    public static void callByReference(int[] array) {
        array[1] = 10;
    }
    public static void callByValue(int value) {
        value = 10;
        System.out.println("1.4 :" + (value == 10));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("1.1 :" + (array[1] == 2));
        callByReference(array);
        System.out.println("1.2 :" + (array[1] == 10));
        
        int value = 1;
        System.out.println("1.3 :" + (value == 1));
        callByValue(value);
        System.out.println("1.5 :" + (value == 1));
    }
}

/*
You should have all trues
-----------------------
1.1 :true
1.2 :true
1.3 :true
1.4 :true
1.5 :true
*/