import java.util.Scanner;

public class FizzBuzzProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Check if input is a positive integer
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a number");
            return;
        }

        // Create a String array to store results
        String[] results = new String[number + 1];

        // Loop through from 0 to the given number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results with index positions
        System.out.println("Results");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
