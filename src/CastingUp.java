class AA {}
class BB extends AA {}

// no problem
class CastingUp {
    public static void test1() {
        BB b = new BB();
        AA a = (AA) b;
    }

    public static void main(String[] args) {
        test1();
    }
}