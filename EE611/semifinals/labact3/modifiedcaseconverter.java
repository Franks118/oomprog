import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class modifiedcaseconverter{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Case Converter");
       Color color = new Color(223,215,159);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JTextField for input
        JTextField textField = new JTextField(20);

        // Create a JButton to trigger the conversion
        JButton convertButton = new JButton("Convert Case");

        // Create a JLabel to display the result
        JLabel resultLabel = new JLabel("");

        // Add components to the panel
        panel.add(textField);
        panel.add(convertButton);
        panel.add(resultLabel);
         panel.setBackground(color);
        frame.pack();
        // Add an ActionListener to the convertButton
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                String convertedText = convertCase(inputText);
                resultLabel.setText(convertedText);
            }
        });

        // Set JFrame properties
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        frame.setSize(300,250);
        frame.setVisible(true);
        
    }

    // Function to convert the case of a string
    private static String convertCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}