import java.math.BigInteger;

class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1234567890123456");
        BigInteger c = new BigInteger("1234567890123456");
        System.out.println("1.1: " + ("1".equals(b.divide(c).toString())));
        System.out.println("1.2: " + ("1524157875323881726870921383936".equals(b.multiply(c).toString())));
    }
}

/** You should have two trues
 * 1.1: true
 * 1.2: true
*/