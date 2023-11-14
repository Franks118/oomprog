import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class UppercaseConverter {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame Jf = new JFrame("Uppercase Converter");
         Color color = new Color(185,215,165);

        
         Jf.setSize(500,500);
        
        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JTextField for input
        JTextField textField = new JTextField(10);

        // Create a JButton to trigger the conversion
        JButton convertButton = new JButton("Convert to Uppercase");

        // Create a JLabel to display the result
        JLabel resultLabel = new JLabel("results:");
        resultLabel.setBounds(100,400,50,0);
       

        // components to the panel
        panel.add(textField);
        panel.add(convertButton);
        panel.add(resultLabel);
        panel.setBackground(color);

        // ActionListener to the convertButton
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                String uppercaseText = inputText.toUpperCase();
                resultLabel.setText(uppercaseText);
            }
        });

        // JFrame properties
        Jf.setPreferredSize(new Dimension(550, 300));
         Jf.setVisible(true);

        Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jf.add(panel);
              
        
         Jf.pack();
             }
}
