class Regex {
    public static void main(String[] args) {
        // [] means grouping
        // $ -> N
        // + -> N
        // # -> N
        String s = "a+b$#c".replaceAll("[$+#]", "N");
        System.out.println("1.1: " + s.equals("aNbNNc"));

        // Insert ! operator to return all the trues
        System.out.println("1.2: " + !"Java is beautiful".matches("Java"));
        // maches method is smarter to understand regex
        System.out.println("1.3: " + "Java is beautiful".matches("Java .*"));
        // equals method is dumb
        System.out.println("1.4: " + !"Java is beautiful".equals("Java .*"));
        System.out.println("1.5: " + "Java .*".equals("Java .*"));
        
        System.out.println("1.6: " + !"Java is fun".equals("Java.*")); // false as equals requires perfect match
        System.out.println("1.7: " + "Java is fun".matches("Java.*")); // true, .* means zero or more any characters. 
        System.out.println("1.8: " + "a".matches(".*")); // true as there are 0 or more A characters.
        System.out.println("1.9: " + "AAAA".matches("A+")); // true as there are 1 or more A characters
        System.out.println("1.10: " + "aAAAA".matches("aA+")); // true as there is a character `a' followed by A characters
        System.out.println("1.11: " + !"440-02-4534".matches("\\d{440}-\\d{02}-\\d{4534}")); // true
        System.out.println("1.12: " + "acabbc".matches("[abc]+")); // true as  the string contains any of a, b, or c character
    }
}

/** You should have 12 trues
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 1.5: true
 1.6: true
 1.7: true
 1.8: true
 1.9: true
 1.10: true
 1.11: true
 1.12: true
*/