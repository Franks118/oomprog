import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//main
public class toUpperCaseConverter {
    public static void main(String[] args) {
        JFrame Jf = new JFrame("Uppercase Converter");
        Color color = new Color(185, 215, 165);
        Jf.setSize(500, 500);

        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
        JButton convertButton = new JButton("Convert to Uppercase");
        JLabel resultLabel = new JLabel("results:");
        resultLabel.setBounds(100, 400, 50, 0);
//to add or to be visible
        panel.add(textField);
        panel.add(convertButton);
        panel.add(resultLabel);
        panel.setBackground(color);
//button action listener
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                String uppercaseText = inputText.toUpperCase();
                resultLabel.setText(uppercaseText);
            }
        });
//when you press enter it shows the result
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String inputText = textField.getText();
                    String uppercaseText = inputText.toUpperCase();
                    resultLabel.setText(uppercaseText);
                }
            }
        });
//JFrame values
        Jf.setPreferredSize(new Dimension(550, 300));
        Jf.setVisible(true);
        Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jf.add(panel);
        Jf.pack();
    }
}
