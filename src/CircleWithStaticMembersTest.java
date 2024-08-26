class CircleWithStaticMembers {
    /**
     * The radius of the circle
     */
    double radius;

    /**
     * The number of the objects created
     */
    static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    CircleWithStaticMembers() {
        radius = 1.0;
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     */
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Return numberOfObjects
     */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }
}

public class CircleWithStaticMembersTest {
    /**
     * Main method
     */
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("1.1: " + (CircleWithStaticMembers.numberOfObjects == 0));

        // Create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("\nAfter creating c1");
        System.out.println("1.2: " + (CircleWithStaticMembers.numberOfObjects == 1));
        // reference variable can be used to access the same static variable
        System.out.println("1.3: " + (c1.numberOfObjects == 1));
        System.out.println("1.4: " + (c1.radius == 1.0));
        // Create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        System.out.println("1.5: " + (c2.numberOfObjects == 2));
        System.out.println("1.6: " + (c2.radius == 5.0));
    }
}

/**
 * output
 Before creating objects
 1.1: true

 After creating c1
 1.2: true
 1.3: true
 1.4: true
 1.5: true
 1.6: true
 */