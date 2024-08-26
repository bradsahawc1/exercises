class A {}
class B extends A {}

// Find which code generates a runtime error, and comment it. 
class CastingDown {
    
    public static void test1() {
        A a = new B();
        B b = (B) a; 
    }

    public static void test2() {
        A a = new A();
        // B b = (B) a; // BOOM!
    }
    
    public static void main(String[] args) {
        test1();
        test2();
    }
}