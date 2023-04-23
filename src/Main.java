import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 77777);
        employees[3] = new Employee("Федоров Федор Федорович", 4, 55000);
        employees[4] = new Employee("Алексеев Алексей Алексеевич", 5, 45000);
        employees[5] = new Employee("Николаев Николай Николаевич", 1, 48000);



        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }

        double totalSalary = Employee.calculateTotalSalary(employees);
        System.out.println("Зарплатный фонд: " + totalSalary);


        Employee employeeWithMinSalary = Employee.getEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getName());

        Employee employeeWithMaxSalary = Employee.getEmployeeWithMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getName());

        double getAverageSalary = Employee.getAverageSalary(employees);
        System.out.println("Средняя зарплата: " + getAverageSalary);

        String[] employeeNames = Employee.getEmployeeNames(employees);
        System.out.println("Ф. И. О. всех сотрудников: " + Arrays.toString(employeeNames));

    }


}