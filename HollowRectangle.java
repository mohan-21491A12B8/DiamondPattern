import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: \n");
        int length = sc.nextInt();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: \n");
        int width = sc.nextInt();

        // Loop through each row of the rectangle
        for (int i = 0; i < length; i++) {
            // Loop through each column of the rectangle
            for (int j = 0; j < width; j++) {
                // If we're on the first or last row, or the first or last column, print an asterisk
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } 
                // Otherwise, print a space to create a hollow rectangle
                else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}