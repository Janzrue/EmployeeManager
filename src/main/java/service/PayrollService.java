package service;

import model.Designer;
import model.Developer;
import model.Employee;
import java.util.List;
import java.util.Scanner;

public class PayrollService {


    public double calculateTotalPayroll(List<Employee> employees){
        double totalPayroll = 0;

        for (Employee e: employees){
            totalPayroll += e.getSalary() + e.calculateBonus();
        }
        System.out.println("The total payroll is: " +totalPayroll);
        return totalPayroll;
    }

    public void showEmployees(List<Employee> employees){
        for (Employee e: employees){
            System.out.println("Name: "+e.getName()+", Role: "+e.getRole()+ ", Salary: "+e.getSalary());
        }
    }

    public void addEtoEmployees(List<Employee> employees,Employee e){
        employees.add(e);
    }

    public Employee initializeEmployee(){
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        int option;

        System.out.println(
                "What kind of employee do you want to create? \n"+
                        "1. Developer \n"+
                        "2. Designer"
        );

        option = sc.nextInt();
        if (option == 1){
            employee = new Developer();
            employee.setRole("Developer");
        } else if (option == 2) {
            employee = new Designer();
            employee.setRole("Designer");
        }

        System.out.print("Write the employee's name: ");
        assert employee != null;
        employee.setName(sc.next());
        System.out.print("Write " +employee.getName()+ "'s salary: ");
        employee.setSalary(sc.nextDouble());

        return employee;

    }
}
