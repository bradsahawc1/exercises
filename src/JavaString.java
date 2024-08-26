class JavaString {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");

        System.out.println("1.1: " + (a == b));
        System.out.println("1.2: " + (c.equals(d)));
        System.out.println("1.3: " + (a.equals(b)));
        System.out.println("1.4: " + (c.equals(d)));
    }
}

/** You should have four trues
 1.1: true
 1.2: true
 1.3: true
 1.4: true
*/