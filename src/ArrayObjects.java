public class ArrayObjects {

    /*
     * You should have the Circle1 object. Execute CircleTest1 to get the Circle1
     * object if necessary.
     */
    public static Circle1[] initialize() {
        Circle1[] circles = new Circle1[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle1(i);
        }
        return circles;
    }

    public static double computeSumOfCircleSizes(Circle1[] circles) {
        double area = 0;
        for (Circle1 c: circles) {
            area += c.getArea();
        }
        return area;
    }
    
    public static void main(String[] args) {
        Circle1[] circles = initialize();
        double area = computeSumOfCircleSizes(circles);
        double expected = Math.PI * (0 + 1 + 4 + 9 + 16);
        System.out.println("1.1: " + (area == expected));
    }

}

/**
 * output
 1.1: true
 */