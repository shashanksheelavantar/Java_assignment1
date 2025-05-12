// 1b. Array List programs

// 1. Write a java program for getting different colors through ArrayList interface and search whether
// the color "Red" is available or not
import java.util.ArrayList;

public class ColorSearch1b1{
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");  // You can remove this line to test the "not found" case
        colors.add("Purple");

        // Print all colors
        System.out.println("List of colors: " + colors);

        // Search for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}
