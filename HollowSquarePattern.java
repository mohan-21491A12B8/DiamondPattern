import java.util.*;

public class HollowSquarePattern {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the side of the square
        System.out.print("Enter the side of the square: \n");

        // Read the input from the user and store it in the variable 'n'
        int n = sc.nextInt();

        // Loop through each row of the square
        for (int i = 0; i < n; i++) {
            // Loop through each column of the square
            for (int j = 0; j < n; j++) {
                // If we're on the first or last row, print '*' for the entire row
                if (i == 0 || i == n - 1) {
                    System.out.print("* ");
                } 
                // If we're on any other row, print '*' only at the first and last column
                else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } 
                    // Otherwise, print a space to fill in the interior of the square
                    else {
                        System.out.print("  ");
                    }
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}