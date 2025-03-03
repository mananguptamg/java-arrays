import java.util.Scanner;

public class BMIusing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3];
        // Array to store weight status
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            double weight, height;
            // Input validation for weight
            do {
                System.out.print("Weight (kg): ");
                weight = input.nextDouble();
            } while (weight <= 0);
            
            // Input validation for height
            do {
                System.out.print("Height (m): ");
                height = input.nextDouble();
            } while (height <= 0);

            // Store weight and height in the array
            personData[i][0] = weight;
            personData[i][1] = height;
            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("BMI Results:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(m)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
