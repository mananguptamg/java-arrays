import java.util.Scanner;

public class StudentGradeCalculatorUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numStudents][3];  
        double[] percentages = new double[numStudents];  
        String[] grades = new String[numStudents];

        // Taking input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Loop through each subject (Physics=0, Chemistry=1, Maths=2)
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                // Validate input for marks (0-100)
                int mark;
                do {
                    System.out.print("Enter " + subject + " marks (0-100): ");
                    mark = input.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Please enter a marks between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                
                marks[i][j] = mark;
            }

            // Compute total and percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("  Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.println("  Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("  Grade: " + grades[i]);
            System.out.println();
        }
    }
}