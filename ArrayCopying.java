import java.util.Scanner;

public class ArrayCopying {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        // Taking user input for matrix elements
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0; // Index for 1D array

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // Copy element and increment index
            }
        }

        // Display the original 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the copied 1D array
        System.out.println("1D Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
