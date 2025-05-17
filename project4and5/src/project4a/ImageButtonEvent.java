// 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
// Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
// pressed by implementing the event handling mechanism with addActionListener( ).

package project4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonEvent {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label to display messages
        JLabel messageLabel = new JLabel("Press a button!");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Load icons and resize them
        ImageIcon clockIcon = new ImageIcon("clock.png");
        Image clockImg = clockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        clockIcon = new ImageIcon(clockImg);

        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");
        Image hourglassImg = hourglassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        hourglassIcon = new ImageIcon(hourglassImg);

        // Create buttons with images
        JButton clockButton = new JButton(clockIcon);
        JButton hourglassButton = new JButton(hourglassIcon);

        // Add ActionListener for clock button
        clockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        // Add ActionListener for hourglass button
        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to frame
        frame.add(clockButton);
        frame.add(hourglassButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}
