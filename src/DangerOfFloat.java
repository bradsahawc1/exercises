// Read the code, and execute the it, and you will 
// see why float/double comparison is dangerous. 

public class DangerOfFloat {

    public static void dangerousFloatingPointNumbers() {
        double y = 10.1;
        System.out.println("1:" + (y == 10.1)); // This is dangerous, think why?

        float y2 = 123232.1234567890123456F; // Don't forget the F for float type data
        System.out.println("2:" + (y2 == 123232.1234F)); // You see why it is dangerous

        double y3 = 123232.1234567890123456; // You can use double in some cases
        System.out.println("3:" + (y3 != 123232.1234));

        double y4 = 123232.1234567890123456; // When we need precise value, it is an error too
        System.out.println("4:" + (y4 == 123232.123456789));
    }

    public static void main(String[] args) {
        dangerousFloatingPointNumbers();
    }
}
/*
 1:true
 2:true
 3:true
 4:true
 */