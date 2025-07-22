package service;

import model.Employee;
import java.util.List;

public class PayrollService {

    public double calculateTotalPayroll(List<Employee> employees) {
        double totalPayroll = 0;
        for (Employee e : employees) {
            totalPayroll += e.getSalary() + e.calculateBonus();
        }
        return totalPayroll;
    }

    public void showEmployees(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println("Name: " + e.getName() + ", Role: " + e.getRole() + ", Salary: " + e.getSalary());
        }
    }
}
