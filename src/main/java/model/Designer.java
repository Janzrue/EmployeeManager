package model;

public class Designer extends Employee{
    public Designer() {
    }

    public Designer(String name, double salary, String role) {
        super(name, salary, role);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

}
