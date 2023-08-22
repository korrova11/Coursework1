public class Employee {
    private final  int id;
    public static int counter;
    private String name;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        counter++;
        this.name = name;
        this.salary = salary;
        this.department = department;
        id = counter;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "id = " + getId() +
                ", ФИО сотрудника " + getName() + '\'' +
                ", зарплата = " + getSalary() +
                ", отдел = " + getDepartment() ;
    }
}


