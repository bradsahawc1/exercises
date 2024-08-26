class AAA {
    protected int x;
    public AAA(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}

class BBB extends AAA {
    public int x;
    public BBB(int x) {
        super(1000); // super.x becomes 1000
        this.x = x + super.x;
    }
    @Override
    public int getX() {
        return this.x;
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        AAA a = new AAA(1);
        System.out.println("1.1: " + (1 == a.getX()));
        
        AAA a2 = new AAA(100);
        System.out.println("1.2: " + (100 == a2.getX()));
        
        BBB b = new BBB(1);
        System.out.println("1.3: " + (1001 == b.getX()));
        
        AAA b2 = new BBB(100);
        System.out.println("1.4: " + (1100 == b2.getX()));
    }
}

/** You should get four trues
 1.1: true
 1.2: true
 1.3: true
 1.4: true
*/