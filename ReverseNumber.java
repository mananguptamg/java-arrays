import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding the count of digits
        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Storing digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // Extract last digit
            temp /= 10; // Remove last digit
        }

        // Displaying the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        
        System.out.println();
    }
}
