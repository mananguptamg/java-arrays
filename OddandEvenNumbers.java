import java.util.Scanner;

public class OddandEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number ");
        int number = input.nextInt();

        // Validate the input
        if (number <= 0) {
            System.err.print("Error: Please enter a natural number (positive integer)");
            return; // Exit the program
        }

        // Define arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1]; // Maximum possible even numbers
        int[] oddNumbers = new int[number / 2 + 1];  // Maximum possible odd numbers
        int evenIndex = 0, oddIndex = 0;

        // Loop to classify numbers as even or odd
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Store even number
            } else {
                oddNumbers[oddIndex++] = i;  // Store odd number
            }
        }

        // Print Odd Numbers Array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print Even Numbers Array
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
