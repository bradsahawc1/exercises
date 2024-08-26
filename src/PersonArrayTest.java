public class PersonArrayTest {

    public static void personTestName() {
        Person[] people = new Person[5];
        people[0] = new Student("A", "j@nku.edu", Student.FRESHMAN);
        people[1] = new Faculty("B", "j@nku.edu", "GH440", 60_000, Faculty.PROFESSOR, 1);
        people[2] = new Staff("C", "j@nku.edu", "GH440", 60_000, "admin");

        for (int i = 0; i < people.length; i++) {
            switch (i) {
            case 0:
                System.out.println("6.1 :" + (people[i].name.equals("A")));
                break;
            case 1:
                System.out.println("6.2 :" + (people[i].name.equals("B")));
                break;
            case 2:
                System.out.println("6.3 :" + (people[i].name.equals("C")));
                break;
            }
        }
    }

    public static void personTestPay() {
        Employee[] employees = new Employee[3];
        employees[0] = new Faculty("A", "j@nku.edu", "GH440", 30_000, Faculty.PROFESSOR, 3);
        employees[1] = new Faculty("B", "j@nku.edu", "GH440", 40_000, Faculty.PROFESSOR, 1);
        employees[2] = new Staff("C", "j@nku.edu", "GH440", 50_000, "admin");

        double sum = 0;
        for (Employee e : employees) {
            sum += e.getPay();
        }
        System.out.println("7.1 :" + (sum == 30000 + 3 * 1000 + 40000 + 1000 + 50000));
    }

    public static void main(String[] args) {
        personTestName();
        personTestPay();
    }
}
/** You should have all trues
 6.1 :true
 6.2 :true
 6.3 :true
 7.1 :true
 */
