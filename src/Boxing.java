class Boxing {
    public static void main(String[] args) {
        System.out.println("1.1: " + (123.45 == Double.parseDouble("123.45")));
        System.out.println("1.2: " + (Integer.MAX_VALUE == Integer.MAX_VALUE));
        System.out.println("1.3: " + (12 == new Double(12.3).intValue()));
        System.out.println("1.4: " + (-1 == new Double(12.4).compareTo(new Double(12.5))));
        System.out.println("1.5: " + (0 == new Double(12.5).compareTo(new Double(12.5))));
        System.out.println("1.6: " + (1 == new Double(12.6).compareTo(new Double(12.5))));

        
        Integer[] i1 = { 1, 2, 3, 4, 5 };
        int[] i2 = { 1, 2, 3, 4, 5 };

        int sum = 0;
        for (Integer i : i1) {
            sum += i;
        }
        System.out.println("1.7: " + (15 == sum));
        sum = 0;
        for (int i : i2) {
            sum += i;
        }
        System.out.println("1.8: " + (15 == sum));
    }
}
/** You should have 8 trues
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 1.5: true
 1.6: true
 1.7: true
 1.8: true
*/