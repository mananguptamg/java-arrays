import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Count frequency of each digit
        while (num > 0) {
            int digit = num % 10;
            frequency[digit]++;
            num /= 10;
        }

        // Display digit frequencies
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " | " + frequency[i]);
            }
        }
    }
}
