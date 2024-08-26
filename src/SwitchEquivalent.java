
public class SwitchEquivalent {
    public static int ifElse(int a, int x) {
        if (a == 1)
            x += 10;
        else if (a == 2)
            x += 20;
        else if (a == 3)
            x += 30;
        else if (a == 4)
            x += 40;
        return x;
    }
    
    public static int switchBreak(int a, int x) {
        switch (a) {
            case 1: x += 10; break;
            case 2: x += 20; break;
            case 3: x += 30; break;
            case 4: x += 40; break;
        }
        return x;
    }
    
    public static void main(String[] args) {
        System.out.println(ifElse(1, 0) == 10);
        System.out.println(ifElse(2, 0) == 20);
        System.out.println(ifElse(3, 0) == 30);
        System.out.println(ifElse(4, 0) == 40);
        
        System.out.println(switchBreak(1, 0) == 10);
        System.out.println(switchBreak(2, 0) == 20);
        System.out.println(switchBreak(3, 0) == 30);
        System.out.println(switchBreak(4, 0) == 40);
    }
}
/* Output:
true
true
true
true
true
true
true
true
*/
