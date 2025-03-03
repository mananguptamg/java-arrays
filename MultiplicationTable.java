import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.println("Enter a number");
        int number = input.nextInt();

        // Define an array to store the results of multiplication
        int[] table = new int[10];

        // Generate multiplication table and store in array
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("Table for " + number);
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
