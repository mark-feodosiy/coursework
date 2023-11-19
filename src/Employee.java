import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int dept;
    private final int id;
    private int salary;
    private static int idCounter = 1;

    public Employee (String firstName,  String middleName, String lastName, int dept, int salary) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee id = " + '\'' + id +'\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dept=" + dept +

                ", salary=" + salary +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
