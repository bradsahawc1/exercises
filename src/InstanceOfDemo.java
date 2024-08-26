class A4 {void a() {};}
class B4 extends A4 {void b() {};}
class C4 extends B4 {void c() {};}

public class InstanceOfDemo {
    public static void instanceOfTest1() {
        A4 a = new C4();
        B4 b = new C4();
        C4 c = new C4();
        
        System.out.println("1.1: " + (a instanceof C4));
        System.out.println("1.2: " + (a instanceof B4));
        System.out.println("1.3: " + (a instanceof A4));
        
        System.out.println("1.4: " + (b instanceof C4));
        System.out.println("1.5: " + (b instanceof B4));
        System.out.println("1.6: " + (b instanceof A4));
        
        System.out.println("1.7: " + (c instanceof C4));
        System.out.println("1.8: " + (c instanceof B4));
        System.out.println("1.9: " + (c instanceof A4));
    }
    
    public static void instanceOfTest2() {
        A4 a = new C4();
        B4 b = new C4();
        C4 c = new C4(); // doesn't compile at all
        
        System.out.println("2.1: " + (a instanceof C4));
        System.out.println("2.2: " + (a instanceof B4));
        System.out.println("2.3: " + (a instanceof A4));
        
        System.out.println("2.4: " + (b instanceof C4));
        System.out.println("2.5: " + (b instanceof B4));
        System.out.println("2.6: " + (b instanceof A4));
    }
    public static void instanceOfTest3() {
        A4 a = new C4();
        B4 b = new C4();
        C4 c = new C4(); // doesn't compile at all
        
        System.out.println("3.1: " + (a instanceof C4));
        System.out.println("3.2: " + (a instanceof B4));
        System.out.println("3.3: " + (a instanceof A4));
    }
    public static void main(String[] args) {
        instanceOfTest1();
        instanceOfTest2();
        instanceOfTest3();
    }
}

/** You should have 18 trues
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 1.5: true
 1.6: true
 1.7: true
 1.8: true
 1.9: true
 2.1: true
 2.2: true
 2.3: true
 2.4: true
 2.5: true
 2.6: true
 3.1: true
 3.2: true
 3.3: true
*/
