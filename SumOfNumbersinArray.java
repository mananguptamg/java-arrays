import java.util.Scanner;

public class SumOfNumbersinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array to store up to 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop) ");
            double num = input.nextDouble();

            // Break if the user enters 0 or a negative number
            if (num <= 0) {
                break;
            }

            // Store in array and increment index if limit is not reached
            numbers[index] = num;
            index++;

            // Break if the array limit is reached
            if (index == 10) {
                break;
            }
        }

        // Calculate the sum of stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers entered
        System.out.println("Numbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display the total sum
        System.out.println("Total Sum: " + total);
    }
}
