// 4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
// pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
// event handling mechanism with addActionListener( ).

package project4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonEvent {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Country Button Example");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Create a label to display message
        JLabel messageLabel = new JLabel("Press a button!");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Add ActionListener to India button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add ActionListener to Srilanka button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}
