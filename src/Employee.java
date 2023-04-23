public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    public static int count =0;

    public Employee(String name, int department, int salary) {
        count++;
        this. id = count;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
             return "Employee{" +
                "id=" + id +
                ", ФИО ='" + name + '\'' +
                ", отдел =" + department +
                ", зарплата =" + salary +
                '}';
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
