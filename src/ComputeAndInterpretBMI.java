public class ComputeAndInterpretBMI {
    /*
     * double bmi = weightInKilograms / (heightInMeters * heightInMeters);
     * 
     * BMI Interpretation
     * BMI < 18.5  => Underweight
     * 18.5 ≤ BMI < 25.0 => Normal
     * 25.0 ≤ BMI < 30.0 => Overweight
     * 30.0 ≤ BMI => Obese
     */
    
    public static String computeBMI(double weight, double height) {
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant 
        final double METERS_PER_INCH = 0.0254; // Constant
        
        double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
    
        // Return result
        if (bmi < 18.5) 
            return "Underweight"; 
        else if (bmi < 25.0)
            return "Normal";
        else if (bmi < 30.0)
            return "Overweight";
        else
            return "Obese";


    }
    
    public static void main(String[] args) {
        /* weight is 200, but heights are varying */ 
        System.out.println("1: " + computeBMI(200,40).equals("Obese"));
        System.out.println("2: " + computeBMI(200,70).equals("Overweight"));
        System.out.println("3: " + computeBMI(200,80).equals("Normal"));
        System.out.println("4: " + computeBMI(200,90).equals("Underweight"));
    }
}

/* Output:
1: true
2: true
3: true
4: true
*/