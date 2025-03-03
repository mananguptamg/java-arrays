import java.util.Scanner;

public class NumberCheckingProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array to store 5 numbers
        int[] numbers = new int[5];

	System.out.println("Enter the numbers");

        // Take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Numbers Checking");
        // Loop through the array to check conditions
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative.");
            } else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }

        // Compare the first and last numbers
        if (numbers[0] > numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[4] + ").");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[4] + ").");
        }
    }
}
