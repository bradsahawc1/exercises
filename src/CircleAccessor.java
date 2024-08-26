class Circle1 {
    double radius = 1;

    /** Constructors */
    Circle1() {}
    Circle1(double newRadius) {
        radius = newRadius;
    }

    /** radius accessor */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /** Return the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return the circumference of this circle */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class CircleAccessor {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        // How to set the radius to 10? 
        c.setRadius(10);

        System.out.println(c.getArea() == 10.0 * 10.0 * Math.PI);

        System.out.println(c.getCircumference() == 2 * 10.0 * Math.PI);
    }
}

/**
 * output
 true
 true
 */