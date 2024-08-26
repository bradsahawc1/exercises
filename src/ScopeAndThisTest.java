class F {
    private int x = 0; // Instance variable 
    private int y = 0; // (1)
    public void p() {
        int x = 1; // Local variable // (4) 
        System.out.println("1.1: " + (x == 1)); // (2)
        {
            int z = 10; // local variable // (6)
            System.out.println("1.2: " + (x == 1)); // (5)
            System.out.println("1.3: " + (y == 0)); // (3)
            System.out.println("1.4: " + (z == 10)); // (7)
        }
        //System.out.println("z = " + z); // ERROR! (8)
    } 
}

class T {
    private int x; // Instance variable 
    public T() { this(0); } // initialize the x value to 0
    public T(int x) {this.x = x;}
    public int getX() {return x;}
}

class ScopeAndThisTest {
    
    public static void test1() {
        F f = new F();
        f.p();
    }
    public static void test2() {
        T t = new T();
        System.out.println("2.1: " + (t.getX() == 0));
        T t2 = new T(100);
        System.out.println("2.2: " + (t2.getX() == 100));
    }
    
    public static void main(String[] args) {
        test1();
        test2();
    }
}

/**
 * output
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 2.1: true
 2.2: true
 */