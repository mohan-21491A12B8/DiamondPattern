import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Initialize the number of spaces needed for the top half of the diamond
        int space = rows - 1;

        // Print the top half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print the necessary spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Print the stars for the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
            // Decrement the number of spaces for the next row
            space--;
        }

        // Reset the number of spaces for the bottom half of the diamond
        space = 1;

        // Print the bottom half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print the necessary spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Print the stars for the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
            // Increment the number of spaces for the next row
            space++;
        }
    }
}