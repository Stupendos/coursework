//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 159000, 1);
        employees[1] = new Employee("Алексеев Алексей Алексеевич", 57000, 4);
        employees[2] = new Employee("Богданов Богдан Богданович", 70000, 5);
        employees[3] = new Employee("Евгеньев Евгений Евгеньевич", 90142, 5);
        employees[4] = new Employee("Михайлова Екатерина Андреевна", 56999, 3);
        employees[5] = new Employee("Николаев Николай Николаевич", 98231, 2);
        employees[6] = new Employee("Сергеев Сергей Сергеевич", 120000, 1);
        employees[7] = new Employee("Маляр Сергей Витальевич", 170000, 2);
        employees[8] = new Employee("Павлов Владислав Андреевич", 130000, 3);
        employees[9] = new Employee("Тихомиров Анатолий Дмитриевич", 114511, 4);
        System.out.println("Сумма затрат на зп в месяц: " + calculateAllSalary());
        System.out.println("Минимальная зп сотрудника: " + findMinSalary());
        System.out.println("Максимальная зп сотрудника: " + findMaxSalary());
        System.out.println("Среднее значение зп: " + calculateAverageSalary());
        printFullName();
    }


    public static int calculateAllSalary() {
        if (employees.length == 0) return 0;
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static int findMinSalary() {
        if (employees.length == 0) return 0;
        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee.getSalary();
    }

    public static int findMaxSalary() {
        if (employees.length == 0) return 0;
        Employee maxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employees[i];
            }
        }
        return maxSalary.getSalary();
    }

    public static int calculateAverageSalary() {
        if (employees.length == 0) return 0;
        return calculateAllSalary() / employees.length;
    }

    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}