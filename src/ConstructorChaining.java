class Person3 {
    public Person3() {
        System.out.println("(1) Invoke Person's constructor");
    }
}

class Employee3 extends Person3 {
    public Employee3() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Invoke Employee's default constructor");
    }
    public Employee3(String s) {
        System.out.println(s);
    }
}

class Faculty3 extends Employee3 {
    public Faculty3() {
        System.out.println("(4) Invoke Faculty's constructors");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("\nPerson p = new Person()");
        Person3 p = new Person3();
        System.out.println("\nEmployee e = new Employee()");
        Employee3 e = new Employee3();
        System.out.println("\nFaculty f = new Faculty()");
        Faculty3 f = new Faculty3();
    }
}
/**

Person p = new Person()
(1) Performs Person's tasks

Employee e = new Employee()
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks

Faculty f = new Faculty()
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks
(4) Performs Faculty's tasks

 Person p = new Person()
 (1) Invoke Person's constructor

 Employee e = new Employee()
 (1) Invoke Person's constructor
 (2) Invoke Employee's overloaded constructor
 (3) Invoke Employee's default constructor

 Faculty f = new Faculty()
 (1) Invoke Person's constructor
 (2) Invoke Employee's overloaded constructor
 (3) Invoke Employee's default constructor
 (4) Invoke Faculty's constructors
*/