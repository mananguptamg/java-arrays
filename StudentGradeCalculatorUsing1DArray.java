import java.util.Scanner;

public class StudentGradeCalculatorUsing1DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Taking input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Taking input for Physics marks
            int marks;
            do {
                System.out.print("Enter Physics marks (0-100): ");
                marks = input.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Please enter a valid mark between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            physics[i] = marks;

            // Taking input for Chemistry marks
            do {
                System.out.print("Enter Chemistry marks (0-100): ");
                marks = input.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Please enter a valid mark between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            chemistry[i] = marks;

            // Taking input for Maths marks
            do {
                System.out.print("Enter Maths marks (0-100): ");
                marks = input.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Please enter a valid mark between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            maths[i] = marks;

            // Compute total and average percentage
            int totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = totalMarks / 3.0;

            // Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A (Excellent)";
            } else if (percentages[i] >= 70) {
                grades[i] = "B (Good)";
            } else if (percentages[i] >= 60) {
                grades[i] = "C (Fair)";
            } else if (percentages[i] >= 50) {
                grades[i] = "D (Needs Improvement)";
            } else if (percentages[i] >= 40) {
                grades[i] = "E (Poor)";
            } else {
                grades[i] = "R (Remedial)";
            }
        }

        // Display results
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + physics[i] + ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i]);
            System.out.println("  Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("  Grade: " + grades[i]);
            System.out.println();
        }
    }
}