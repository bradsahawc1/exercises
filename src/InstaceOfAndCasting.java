class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
class Chiwawa extends Dog {};

public class InstaceOfAndCasting {

    public static void instanceOf() {
        Animal d = new Dog();
        Animal c = new Cat();
        Animal chiwawa = new Chiwawa();
        System.out.println("1.1 :" + (d instanceof Dog));
        System.out.println("1.2 :" + (d instanceof Animal));
        System.out.println("1.3 :" + (c instanceof Cat));
        System.out.println("1.4 :" + (c instanceof Cat));
        System.out.println("1.5 :" + (c instanceof Animal));
        System.out.println("1.6 :" + (chiwawa instanceof Chiwawa));
        System.out.println("1.7 :" + (chiwawa instanceof Dog));
        System.out.println("1.8 :" + (chiwawa instanceof Animal));
        System.out.println("1.9 :" + (chiwawa instanceof Chiwawa));

        Chiwawa chiwawa2 = (Chiwawa) chiwawa;
        System.out.println("1.10 :" + (chiwawa2 instanceof Chiwawa));
        System.out.println("1.11 :" + (chiwawa2 instanceof Dog));
        System.out.println("1.12 :" + (chiwawa2 instanceof Animal));
    }

    public static void compilationOKorNot() {
        // Check if this is OK or not. If not OK (not compiled), comment it and think why.
        //Chiwawa c = new Animal();

        // Check if this is OK or not. If not OK (not compiled), comment it and think why
        Dog d = new Chiwawa();
        Animal a = new Chiwawa();
    }

    public static void casting() {
        // Check if this is OK or not. If not OK (compile error or runtime error), comment it and think why
        Dog d = new Dog();
        //Chiwawa c = (Chiwawa)d;

        // Check if this is OK or not. If not OK (compile error or runtime error), comment it and think why
        Chiwawa c2 = new Chiwawa();
        Dog d2 = (Dog)c2;
    }

    public static void main(String[] args) {
        instanceOf();
        compilationOKorNot();
        casting();
    }
}

/** You should have 12 trues
 1.1 :true
 1.2 :true
 1.3 :true
 1.4 :true
 1.5 :true
 1.6 :true
 1.7 :true
 1.8 :true
 1.9 :true
 1.10 :true
 1.11 :true
 1.12 :true
*/


