import java.util.Scanner;

public class StudentVotingChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array to store the ages of 10 students
        int[] ages = new int[10];
	
	// Displaying message to prompt user
	System.out.println("Enter the ages of student");

        // Take user input for student ages
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }
    }
}
