import java.util.Scanner;

public class MeanOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of size 11 to store players' heights
        double[] heights = new double[11];
        double sum = 0.0;

        // Get user input for each player's height
        System.out.println("Enter the heights of players (in cm):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height ");
            heights[i] = input.nextDouble();
            sum += heights[i];  // Add each height to sum
        }

        // Calculate mean height
        double meanHeight = sum / 11;

        // Display the result
        System.out.printf("\nThe mean height of the football team is: %.2f cm\n", meanHeight);
    }
}
