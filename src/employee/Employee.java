package employee;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String position;

    public Employee(int id, String name, double salary, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayEmployeeInfo() {
        System.out.println("id: " + id + " name: " + name + " salary: " + salary + " position: " + position);

    }
}
