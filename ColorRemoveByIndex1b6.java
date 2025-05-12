// 6. Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index

import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemoveByIndex1b6 {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Get input for which element to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the color to remove: ");
        int index = scanner.nextInt();

        // Check for valid index and remove element
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color at index " + index + ": " + removedColor);
        } else {
            System.out.println("Invalid index! No color removed.");
        }

        // Display updated list
        System.out.println("Updated color list: " + colors);
    }
}
