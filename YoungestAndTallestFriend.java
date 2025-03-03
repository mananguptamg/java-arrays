import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Finding the youngest friend
        int minAge = ages[0];
        String youngestFriend = friends[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = friends[i];
            }
        }

        // Finding the tallest friend
        double maxHeight = heights[0];
        String tallestFriend = friends[0];

        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        // Displaying results
        System.out.println("Youngest Friend: " + youngestFriend);
        System.out.println("Tallest Friend: " + tallestFriend);
    }
}
