// 4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
// Programming in Blue color plain font with font size of 32 using Jframe and Jlabel
package project4a;
import javax.swing.*;  // Swing package
import java.awt.*;     // Font & Color

public class HelloSwing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font and color
        label.setFont(new Font("Plain", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame visible
        frame.setVisible(true);
    }
}
