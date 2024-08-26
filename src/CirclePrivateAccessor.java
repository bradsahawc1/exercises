class CirclePrivate {
    private double radius = 1;

    /** Constructors */
    CirclePrivate() {}
    CirclePrivate(double newRadius) {
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

class CirclePrivateAccessor {
    public static void main(String[] args) {
        CirclePrivate c = new CirclePrivate();
        c.setRadius(10.0);
        System.out.println(c.getArea() == 10.0 * 10.0 * Math.PI);
        System.out.println(c.getCircumference() == 2 * 10.0 * Math.PI);
    }
}

/**
 * output
 true
 true
 */