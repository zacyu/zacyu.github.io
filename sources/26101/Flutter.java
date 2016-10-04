/**
 * CS/COE 0401 Lab 2: Flutter
 * @author Zac Yu <me@zacyu.com>
 */

import javax.swing.*;

public class Flutter {
    public static void main(String[] args) {
        final String DIALOG_TITLE = "Flutter";
        try {
            // Set OS specific Look & Feel.
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Failed to set Look & Feel.");
        }
        String flapContent = JOptionPane.showInputDialog(null,
                "Enter a flap:", DIALOG_TITLE, JOptionPane.QUESTION_MESSAGE);
        // If the user's input consists of 26 characters or less.
        if (flapContent.length() <= 26) {
            JOptionPane.showMessageDialog(null,
                    flapContent,
                    DIALOG_TITLE, JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null,
                    "You've exceeded the maximum character limit of 26 characters.",
                    DIALOG_TITLE, JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}
