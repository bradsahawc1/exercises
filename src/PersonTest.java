import java.util.*;

class Person {
    protected String name;
    protected String email;
  
    public Person() {}
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person: " + this.name;
    }
}

class Student extends Person {
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;
  
    protected int status;
  
    public Student() {}
    public Student(String name, String email, int status) {
        super(name, email);
        this.status = status;
    }
  
    @Override
    public String toString() {
        return "Student: " + super.name ;
    }
}

class Employee extends Person {
    protected String office;
    protected int salary;
    
    public Employee() {}
    public Employee(String name, String email, String office, 
        int salary) {
        super(name, email);
        this.office = office;
        this.salary = salary;
    }
    public double getPay() {
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee: " + super.name + "@" + this.office + "(" + this.salary + ")";
    }
}

class Faculty extends Employee {
    public static int LECTURER = 1;
    public static int ASSISTANT_PROFESSOR = 2;
    public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;
 
    protected int rank;
    protected int courseCount; 
    
    public Faculty() {}
    public Faculty(String name, String email, 
        String office, int salary, int rank, int courseCount) {
        super(name, email, office, salary);
        this.rank = rank;
        this.courseCount = courseCount;
    }
    @Override
    public double getPay() {
        return this.salary + this.courseCount*1000;
    }
  
    @Override
    public String toString() {
        return "Faculty" + "(" + this.rank + ")-" + super.toString();
    }
}

class Staff extends Employee {
  protected String title;

  public Staff() {}
  public Staff(String name, String email, String office, int salary, String title) {
      super(name, email, office, salary);
      this.title = title;
  }

  @Override
  public String toString() {
      return "Staff" + "(" + this.title + ")-" + super.toString();
  }
}

public class PersonTest {
    
    public void test1() {
        Person p = new Person("James", "j@nku.edu");
        System.out.println("1.1 :" + (p.toString().equals("Person: James")));
        System.out.println("1.2 :" + (p.name.equals("James")));
    }
    
    public void test2() {
        Student p = new Student("James", "j@nku.edu", Student.FRESHMAN);
        System.out.println("2.1 :" + (p.toString().equals("Student: James")));
        System.out.println("2.2 :" + (p.status == Student.FRESHMAN));
    }
    
    public void test3() {
        Employee p = new Employee("James", "j@nku.edu", "GH440", 55_000);
        System.out.println("3.1 :" + (p.toString().equals("Employee: James@GH440(55000)")));
        System.out.println("3.2 :" + (p.salary == 55000));
    }
    
    public void test4() {
        Faculty p = new Faculty("James", "j@nku.edu", "GH440", 60_000, Faculty.PROFESSOR, 2);
        System.out.println("4.1 :" + (p.toString().equals("Faculty(4)-Employee: James@GH440(60000)")));
        System.out.println("4.2 :" + (p.salary == 60000));
        System.out.println("4.3 :" + (p.rank == Faculty.PROFESSOR));
        System.out.println("4.4 :" + (p.courseCount == 2));
    }
    
    public void test5() {
        Staff p = new Staff("James", "j@nku.edu", "GH440", 
            60_000, "admin");
        System.out.println("5.1 :" + (p.toString().equals("Staff(admin)-Employee: James@GH440(60000)")));
        System.out.println("5.2 :" + (p.salary == 60000));
        System.out.println("5.3 :" + (p.title == "admin"));
    }
    public static void personTest() {
        PersonTest t = new PersonTest();
        t.test1();
        t.test2();
        t.test3();
        t.test4();
        t.test5();
    }
    
    public static void main(String[] args) {
        personTest();
    }
}

/** You should all trues
 1.1 :true
 1.2 :true
 2.1 :true
 2.2 :true
 3.1 :true
 3.2 :true
 4.1 :true
 4.2 :true
 4.3 :true
 4.4 :true
 5.1 :true
 5.2 :true
 5.3 :true
*/