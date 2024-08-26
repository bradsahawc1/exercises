import java.util.Scanner;

class QuadraticOOP {

    // member fields 
    private int a, b, c;
    
    // constructor
    QuadraticOOP(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // implement methods
    public double getDiscriminant() {
        double disc = (Math.pow(b, 2) - 4 * a * c);
        return disc;
    }
    double getSolution1() {
        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double r1 = (-b + sqrt) / (2 * a);
        return r1;
    }
    double getSolution2() {
        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double r2 = (-b - sqrt) / (2 * a);
        return r2;
    }
   
}

public class QuadraticOOPTest {
    public static void main(String[] args) {
        QuadraticOOP q = new QuadraticOOP(1, 3, 1);
        System.out.println(q.getDiscriminant());
        System.out.println(q.getSolution1());
        System.out.println(q.getSolution2());
    }
}

/**
 * Copy output here
 * 5.0
 * -0.3819660112501051
 * -2.618033988749895
 */
