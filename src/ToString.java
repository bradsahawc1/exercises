class Aha {
}

class Bha {
    @Override
    public String toString() {
        return "B";
    }
}

class ToString {
    public static void main(String[] args) {
        Aha a = new Aha();
        System.out.println(a);
        
        Bha b = new Bha();
        System.out.println(b);
    }
}

/*
Aha@6a5fc7f7
B
 */