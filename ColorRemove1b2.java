// 2. Write a java program for getting different colors through ArrayList interface and remove the
// 2nd element and color "Blue" from the ArrayList
import java.util.ArrayList;

public class ColorRemove1b2 {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedColor = colors.remove(1);
            System.out.println("Removed 2nd element: " + removedColor);
        } else {
            System.out.println("List doesn't have a 2nd element to remove.");
        }

        // Remove color "Blue" if present
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed color: Blue");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display the updated list
        System.out.println("Updated color list: " + colors);
    }
}
