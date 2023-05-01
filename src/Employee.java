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

}
