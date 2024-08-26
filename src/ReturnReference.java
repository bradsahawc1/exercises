public class ReturnReference {

    public static int[] m() {
        int[] array = {1,2,3,4,5};
        return array;
    }
    public static void main(String[] args) {
        int[] array = m();
        System.out.println("1.2 :" + (array[1] == 2));
        array[1] = 10;
        System.out.println("1.2 :" + (array[1] == 10));
    }
}

/*
You should all trues
-----------------------
1.2 :true
1.2 :true
*/