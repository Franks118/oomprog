import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

public class labact53 implements ItemListener {
    JLabel title, listLabel, toppingsJLabel, title2, labels1;
    JComboBox cmbo, cmbox;
    JTextArea t1;
    String[] size = { "Small", "Medium", "Large" };
    String[] toppings = { "GroundBeef", "Pepperoni", "Mozzarella", "Mushrooms", "Black Olives" };

    public labact53() {
        JFrame j = new JFrame("Alberto's ");
        title = new JLabel("Alberto's Pizza");
        title.setFont(new Font("Arial", Font.BOLD, 17));
        title.setBounds(50, 5, 180, 30);
        title2 = new JLabel("--------------------------------------");
        title2.setBounds(50, 20, 180, 30);
        listLabel = new JLabel("Size List:");
        listLabel.setBounds(100, 30, 130, 30);
        cmbo = new JComboBox(size);
        cmbo.setBounds(50, 55, 150, 30);
        cmbo.setSelectedIndex(-1);
        toppingsJLabel = new JLabel("Topping List: ");
        toppingsJLabel.setBounds(90, 90, 130, 30);
        cmbox = new JComboBox(toppings);
        cmbox.setEnabled(false);
        cmbox.setSelectedIndex(-1);
        cmbox.setBounds(50, 115, 150, 30);
        labels1 = new JLabel("--------------------------------------");
        labels1.setBounds(50, 150, 180, 30);

        t1 = new JTextArea("Total Price: ");
        t1.setBounds(50, 170, 150, 20);
        t1.setEditable(false);
        cmbo.addItemListener(this);
        cmbox.addItemListener(this);
        j.add(t1);
        j.add(cmbo);
        j.add(cmbox);
        j.add(title);
        j.add(listLabel);
        j.add(toppingsJLabel);
        j.add(title2);
        j.add(labels1);
        j.setSize(300, 300);
        j.setLayout(null);
        j.setVisible(true);
        j.setResizable(false);
        Color customColor3 = new Color(200, 50, 25);
        j.getContentPane().setBackground(customColor3);
    }

    public void itemStateChanged(ItemEvent e) {
        if (cmbo.getSelectedIndex() != -1 && cmbox.getSelectedIndex() == -1) {
            cmbox.setEnabled(true);
        } else {
            int p1 = Price_size(cmbo.getSelectedIndex());
            int p2 = Price_toppings(cmbox.getSelectedIndex());
            int total = p1 + p2;
            t1.setText("Total Price: " + total);
        }
    }

    public static int Price_size(Object selection) {
        int value = 0;
        switch ((int) selection) {
            case 0:
                value = 300;
                break;
            case 1:
                value = 400;
                break;
            case 2:
                value = 600;
                break;
        }
        return value;
    }

    public static int Price_toppings(Object selection) {
        if ((int) selection == 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        new labact53();
    }
}