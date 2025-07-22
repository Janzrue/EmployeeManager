package ui;

import model.Designer;
import model.Developer;
import model.Employee;
import service.PayrollService;

import java.util.*;
import java.util.function.Supplier;

public class ConsoleManager {
    private final Scanner SC = new Scanner(System.in);
    private final PayrollService PAYROLLSERVICE = new PayrollService();
    private final List<Employee> EMPLOYESS = new ArrayList<>();


    public void run(){
        int option = 0;
        do {
            showMenu();
            option = getUserOption();
            handleOption(option);
        } while (option != 4);
        System.out.println("Exiting program...");
        SC.close();
    }

    private void showMenu(){
        System.out.println("""
                \n=== Employee Management Menu ===
                1. Create an employee
                2. Show all employees
                3. Calculate total payroll
                4. Exit
                """);
    }

    private int getUserOption(){
        int option = -1;
        while (option < 1 || option > 4){
            System.out.print("Enter option: ");
            try{
                option = SC.nextInt();
                SC.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                SC.nextLine();
            }
        }
        return option;
    }

    private void handleOption(int option){
        switch (option){
            case 1 -> createEmployee();
            case 2 -> PAYROLLSERVICE.showEmployees(EMPLOYESS);
            case 3 ->{
                double totalPayroll = PAYROLLSERVICE.calculateTotalPayroll(EMPLOYESS);
                System.out.println("The total payroll is: " +totalPayroll);
            }
            case 4 -> System.out.println("Thank you for using Employee manager");
        }
    }

    private void createEmployee(){
        System.out.println("""
                === Employee Role Menu ===
                1. Developer
                2. Designer
                """);

        int choice = -1;
        while (choice != 1 && choice != 2) {
            System.out.print("Enter option: ");
            try {
                choice = SC.nextInt();
                SC.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                SC.nextLine();
            }
        }

        System.out.print("Enter employee name: ");
        String name = SC.nextLine();

        double salary = -1;
        while (salary <= 0) {
            System.out.print("Enter salary: ");
            try {
                salary = SC.nextDouble();
                SC.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                SC.nextLine();
            }
        }

        Employee employee = (choice == 1) ? new Developer(name, salary, "Developer") : new Designer(name, salary, "Designer");
        EMPLOYESS.add(employee);
        System.out.println("Employee added successfully.");
    }


}
