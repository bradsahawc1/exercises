class Circle2 {
    // step 2: define a data field
    double radius; // initialized to 0.0

    // step 3: define constructors
    public Circle2() {}
    public Circle2(double newRadius) {
        radius = newRadius;
    }
}

class Circle3 {
    // step 2: define a data field
    double radius; // initialized to 0.0

    // step 3: define constructors
    public Circle3() {
        this.radius = 0.0;
    }
    public Circle3(double newRadius) {
        radius = newRadius;
    }
}

public class Constructors {

    public static void main(String[] args) {
        Circle2 c2 = new Circle2(); // initialized to 0.0
        System.out.println("1.1: " + (c2.radius == 0.0));
        c2 = new Circle2(10); // initialized to 10.0
        System.out.println("1.2: " + (c2.radius == 10.0));
        Circle3 c3 = new Circle3(); // initialized to 0.0
        System.out.println("1.3: " + (c3.radius == 0.0));
        c3 = new Circle3(20.0); // initialized to 20.0
        System.out.println("1.4: " + (c3.radius == 20.0));
    }
}

/**
 * output
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 */