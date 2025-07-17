import model.Employee;
import service.PayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Employee employee;
        PayrollService payrollService = new PayrollService();
        int option = 0;

        while (option != 4) {
            System.out.println(
                    "Welcome to employee Manager. Select one of the following options \n"+
                    "1. Create an employee \n"+
                    "2. Show all employees \n"+
                    "3. Calculate total payroll \n"+
                    "4. Exit"
            );

            option = sc.nextInt();
            switch (option){
                case 1:
                    employee = payrollService.initializeEmployee();
                    payrollService.addEtoEmployees(employees, employee);
                    break;

                case 2:
                    payrollService.showEmployees(employees);
                    break;

                case 3:
                    payrollService.calculateTotalPayroll(employees);
                    break;
            }
        }
        sc.close();
    }
}
