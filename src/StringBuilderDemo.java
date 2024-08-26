class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");

        System.out.println("1.1: " + "Welcome to Java".equals(stringBuilder.toString()));
        System.out.println("1.2: " + stringBuilder.toString().equals("Welcome to Java"));
        stringBuilder.reverse(); // what is the method to reverse a string?
        System.out.println("1.3: " + stringBuilder.toString().equals("avaJ ot emocleW"));
    }
}

/** You should have three trues
 1.1: true
 1.2: true
 1.3: true
*/