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
