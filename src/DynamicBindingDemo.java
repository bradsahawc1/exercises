public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent2());
        m(new Student2());
        m(new Person2());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent2 extends Student2 {
}

class Student2 extends Person2 {
    @Override 
    public String toString() {
        return "Student";
    }
}

class Person2 extends Object {
    @Override 
    public String toString() {
        return "Person";
    }
}

/**
    (1) Performs Person's tasks
    Student
    (1) Performs Person's tasks
    Student
    (1) Performs Person's tasks
    Person@5e481248
    java.lang.Object@66d3c617

 Student
 Student
 Person
 java.lang.Object@1e643faf
*/