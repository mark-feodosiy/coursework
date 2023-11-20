public class Main {
    //Курсовая работа
    private static final Employee[] employees = new Employee[10];
    //private static Object printAllEmployees;

    public static void main(String[] args) {
        employees[0] = new Employee("name1", "patronymic1", "surname1", 1, 1000);
        employees[1] = new Employee("name2", "patronymic2", "surname2", 1, 2000);
        employees[2] = new Employee("name3", "patronymic3", "surname3", 2, 8150);
        employees[3] = new Employee("name4", "patronymic4", "surname4", 2, 800);
        employees[4] = new Employee("name5", "patronymic5", "surname5", 3, 2500);
        employees[5] = new Employee("name6", "patronymic6", "surname6", 3, 1200);
        employees[6] = new Employee("name7", "patronymic7", "surname7", 4, 2100);
        employees[7] = new Employee("name8", "patronymic8", "surname8", 4, 1900);
        employees[8] = new Employee("name9", "patronymic9", "surname9", 5, 700);
        employees[9] = new Employee("name10", "patronymic10", "surname10", 5, 3200);
        printAllEmployees();
        System.out.println();
        totalSalary();
        System.out.println(totalSalary());
        System.out.println();
        minSalary();
        System.out.println(minSalary());
        System.out.println();
        maxSalary();
        System.out.println(maxSalary());
        System.out.println();
        averageSalary();
        System.out.println(averageSalary());
        System.out.println();
        printSpn();
    }

    private static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    private static Employee minSalary() {
        Employee min = employees [0];
        for (int i = 0; i < employees.length; i++) {
            if (employees [i].getSalary() < min.getSalary()) {
            min = employees [i];
            }
        }
        return min;
    }
    private static Employee maxSalary() {
        Employee max = employees [0];
        for (int i = 0; i < employees.length; i++) {
            if (employees [i].getSalary() > max.getSalary()) {
                max = employees [i];
            }
        }
        return max;
    }
    private static int averageSalary() {
        int avrg = 0;
        int i =0;
        for (int j = 0; j < employees.length; j++) {
            i++;
            avrg = avrg + employees [j].getSalary() ;
        }
        return avrg / i;
    }
    private static void printSpn() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + ' ' + employee.getFirstName() + ' ' + employee.getMiddleName());
        }
    }
}