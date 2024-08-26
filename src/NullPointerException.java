class Test {
    public void hello() {}
}

class Test2 {
    Test t = new Test(); // Why is this an error?
}

public class NullPointerException {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.t.hello(); // we expect a runtime exception. NullPointError
    }
}

/**
 * output

 Process finished with exit code 0
 */