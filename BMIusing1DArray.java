import java.util.Scanner;

public class BMIusing1DArray
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // Arrays to store height, weight, BMI, and status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height and weight for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Display the results
        System.out.println("Height | Weight | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + " | " + weight[i] + " | " + bmi[i] + " | " + status[i]);
        }
    }
}
