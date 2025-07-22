package model;

public abstract class Employee {
    private String name;
    private double salary;
    private String role;

    public Employee() {
    }

    public Employee(String name, double salary, String role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public abstract double calculateBonus();
}
