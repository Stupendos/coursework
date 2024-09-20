import java.util.Objects;


public class Employee {
    private final int id;
    private final String fullName;
    private int salary;
    private int department;
    private static int count = 0;

    public Employee(final String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = ++count;
    }

    public final int getId() {
        return id;
    }

    public final String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, salary, department);
    }

}


