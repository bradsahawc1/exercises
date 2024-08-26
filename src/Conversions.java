class Conversions {
    public static void main(String[] args) {
        double dValue = 12.3;
        String dValueString = "12.3";
        Double dValueObject = new Double(dValue);

        // conversion between primitive type values and related objects
        System.out.println("1.1: " + (dValue == dValueObject.doubleValue()));
        System.out.println("1.2: " + !(dValueObject == new Double(dValue))); // No! object address comparison
        System.out.println("1.3: " + (dValueObject.equals(new Double(dValue)))); // Yes, object content comparison

        // From string to primitive values or objects
        System.out.println("1.4: " + (Double.parseDouble(dValueString) == dValue)); // Yes, because they're primitive values.
        System.out.println("1.5: " + !(Double.valueOf(dValueString) == dValueObject)); // No! object address comparison
        System.out.println("1.6: " + (Double.valueOf(dValueString).equals(dValueObject))); // Yes, object content comparison

        // To string from object (easy)
        System.out.println("1.7: " + !(dValueObject.toString() == dValueString)); // No! String is an object
        System.out.println("1.8: " + (dValueObject.toString().equals(dValueString))); // Yes, object content comparison

        // To string from primitive data types
        System.out.println("1.9: " + ("12.30".equals(String.format("%5.2f", dValue))));
    }
}

/** You should have nine trues
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 1.5: true
 1.6: true
 1.7: true
 1.8: true
 1.9: true
*/