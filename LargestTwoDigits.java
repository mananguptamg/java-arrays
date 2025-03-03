import java.util.Scanner;

public class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Max number of digits to store
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Storing digits in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;  // Extract last digit
            number /= 10;  // Remove last digit
            index++;
        }

        // Handling case where there are no digits
        if (index == 0) {
            System.out.println("No digits");
            return;
        }

        // Finding the largest and second largest digit
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the results
        System.out.println("Largest Digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest Digit: " + secondLargest);
        } else {
            System.out.println("No Second Largest Digit found");
        }
    }
}
