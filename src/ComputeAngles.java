public class ComputeAngles {
    public static String getSides(double x1, double y1, 
            double x2, double y2, 
            double x3, double y3) {
    // Compute three sides
    double a = Math.sqrt((x2 - x3) * (x2 - x3)
        + (y2 - y3) * (y2 - y3));
    double b = Math.sqrt((x1 - x3) * (x1 - x3)
        + (y1 - y3) * (y1 - y3));
    double c = Math.sqrt((x1 - x2) * (x1 - x2)
        + (y1 - y2) * (y1 - y2));

    // Compute three angles
    double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
    double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
    
    // Display results
    return String.format("%5.2f %5.2f %5.2f", A, B, C);
  }
  
  public static void main(String[] args ) {
      System.out.println("1: " + getSides(1, 1, 6.5, 1, 6.5, 2.5).equals("15.26 90.00 74.74"));
  }
}

/** Copy results here
 1: true
*/
