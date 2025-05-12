// 4. Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort1b4 {
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

        // Sort the colors alphabetically
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted color list: " + colors);
    }
}
