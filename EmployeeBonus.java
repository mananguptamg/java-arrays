import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NUM_EMPLOYEES = 10; // Employee number is constant

        // Arrays to store salaries, years of service, and new salaries
        double[] salaries = new double[NUM_EMPLOYEES];
        int[] yearsOfService = new int[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];

        // Variables to track total expenses
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input for salaries and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                System.out.print("Enter salary for Employee " + (i + 1) + ": ");
                double salary = input.nextDouble();
                System.out.print("Enter years of service for Employee " + (i + 1) + ": ");
                int years = input.nextInt();

                // Validate input
                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input! Please enter re-enter correct data");
                }
            }
        }

        // Compute new salaries and total values
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            double bonus = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonus;

            // Accumulate totals
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display new salaries
        System.out.println("New Salaries of Employees:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: %.2f\n", (i + 1), newSalaries[i]);
        }

        // Display total amounts
        System.out.println("Total Bonus Paid: $" + totalBonus);
        System.out.println("Total Old Salary:" + totalOldSalary);
        System.out.println("Total New Salary after Bonus: " + totalNewSalary);
    }
}
