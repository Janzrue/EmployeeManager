package model;

public class Developer extends Employee{
    public Developer() {
    }

    public Developer(String name, double salary, String role) {
        super(name, salary, role);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
}
