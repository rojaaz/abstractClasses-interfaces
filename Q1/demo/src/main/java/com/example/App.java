
package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select employee type (1: Full-Time, 2: Hourly):");
        int type = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        Employee employee;

        if (type == 1) {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, id, salary);
        } else {
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();
            employee = new HourlyEmployee(name, id, rate, hours);
        }

        System.out.println("\n--- Employee Info ---");
        employee.displayInfo();
        System.out.println("Calculated Salary: " + employee.calculateSalary());

        scanner.close();
    }
}
