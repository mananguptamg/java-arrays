import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Error: Please enter a positive integer.");
            return; // Exit the program
        }

        // Initialize variables
        int maxFactor = 10; // Initial size of the array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Track index of the array

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor
                // Resize the array if needed
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor]; // New array with more space
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old factors to new array
                    factors = temp; // Assign new array to factors
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

