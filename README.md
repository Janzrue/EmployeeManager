# Employee Manager - Java Console App (OOP Mini Project)

## Introduction
**Employee Manager** is a Java console application designed to simulate basic employee management operations while reinforcing object-oriented programming (OOP) principles. The project was developed as part of a backend learning journey focused on building modular, scalable, and portfolio-ready software.

Built around an abstract `Employee` class and its specialized subclasses (`Developer`, `Designer`), the application enables users to manage employee records, calculate role-based bonuses, and compute total payroll interactively through a console menu. The design emphasizes clean architecture through the use of service layers and follows best practices in inheritance, encapsulation, and polymorphism.

---
## Purpose
This mini project was created to:
- Apply core Java OOP concepts in a real-world simulation.
- Practice clean code structure and modular design.
- Serve as a portfolio artifact showcasing backend logic, collection usage, and console interaction.
- Prepare for future backend development with frameworks such as Spring Boot.

---
## Features
- Abstract `Employee` class with specialized subtypes (`Developer`, `Designer`)
- Role-based bonus calculation via polymorphism
- Dynamic storage of employees using `List<Employee>`
- Console-based menu for:
  - Creating employees
  - Listing current employees
  - Calculating total payroll including bonuses
- Modular service layer (`PayrollService`) for business logic
- Code structured in packages: `model/`, `service/`, and project entry point

---
## Repository Structure

```
src/
├── main/
│   ├── model/                        # Base classes and subclasses of employees
│   ├── service/                      # Logic for managing employees and payroll
│   └── ui/                           # Console operation and user interaction
│   └── EmployeeManagerApp.java       # Main class
└── test/
    └── model/                        # Unit tests for bonuses
    └── service/                      # Unit tests for PayrollService
```

---
## Compile using IDE
-Clone the repository:

   ```bash
   git clone https://github.com/Janzrue/EmployeeManager.git
   ```
- Open the proyect in your favorite IDE
- Execute the `Main.java` class located in the main package
- Interact with the interface via console

---
## Sample Output

````
=== Employee Management Menu ===
1. Create Employee
2. List Employees
3. Calculate Total Payroll
4. Exit

Enter option: 1
Enter name: Alice
Enter role: Developer
Enter salary: 5000
Employee added successfully!

Enter option: 2
Name: Alice, Role: Developer, Salary: 5000.0

Enter option: 3
The total payroll is: 5750.0
````

---
## How to run the tests

This project includes unit testing with JUnit 5.

- From your IDE:
- Right click on the `java` folder located in test package and select **Run Tests in java**.
- If you use Gradle or Maven, make sure you have the JUnit 5 dependency configured.

---
## License

This project is open to the public for educational purposes. You are free to use, study and modify it.

---
## Autor

Developed by [@Janzrue](https://github.com/Janzrue)

---
