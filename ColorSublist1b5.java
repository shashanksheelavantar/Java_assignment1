// 5. Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.ArrayList;
import java.util.List;

public class ColorSublist1b5 {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");     // Index 0
        colors.add("Blue");    // Index 1
        colors.add("Green");   // Index 2
        colors.add("Yellow");  // Index 3
        colors.add("Purple");  // Index 4

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Extract the 1st and 2nd elements (index 0 to 2, exclusive)
        if (colors.size() >= 2) {
            List<String> subList = colors.subList(0, 2);
            System.out.println("Sublist (1st and 2nd elements): " + subList);
        } else {
            System.out.println("Not enough elements to extract a sublist.");
        }
    }
}
