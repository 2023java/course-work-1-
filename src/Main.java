import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 99999);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 77777);
        employees[3] = new Employee("Федоров Федор Федорович", 4, 55000);
        employees[4] = new Employee("Алексеев Алексей Алексеевич", 5, 45000);
        employees[5] = new Employee("Николаев Николай Николаевич", 1, 48000);



        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }

        double totalSalary = calculateTotalSalary(employees);
        System.out.println("Зарплатный фонд: " + totalSalary);


        Employee employeeWithMinSalary = getEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getName());

        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getName());

        double getAverageSalary = getAverageSalary(employees);
        System.out.println("Средняя зарплата: " + getAverageSalary);

        String[] employeeNames = getEmployeeNames(employees);
        System.out.println("Ф. И. О. всех сотрудников: " + Arrays.toString(employeeNames));

    }




    public static double calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary = totalSalary + employee.getSalary();
            }
        }
        return totalSalary;
    }
    public static double getAverageSalary(Employee[] employees) {
        int summ = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                summ = summ + employee.getSalary();
            }
        }
        return (double) summ/Employee.count;
    }
    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 0; i < Employee.count; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 0; i < Employee.count; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }


    public static String[] getEmployeeNames(Employee[] employees) {
        String[] employeeNames = new String[employees.length];
        for (int i = 0; i < Employee.count; i++) {
            employeeNames[i] = employees[i].getName();
        }
        return employeeNames;
    }



}