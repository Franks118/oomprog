import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;

public class labact5 implements ActionListener {
    JLabel mFrames, mFrames2, Psize, Ptype, j5;
    JCheckBox pepperoni, chesee, Mushrooms, Sausage, Bourbon, Onions, Olives;
    JRadioButton small, mediumP, large, thin, medium2, pan;
    JButton b1;
    JTextArea t1;
    double amount = 0;

    public labact5() {
        JFrame jFrame = new JFrame("Alberto's Pizza Menu");

        mFrames = new JLabel("Alberto's Pizza Shop");
        mFrames.setBounds(60, 30, 400, 45);
        mFrames.setFont(new Font("Arial", Font.BOLD, 25));
        mFrames2 = new JLabel("Each Topping: $1.50");

        mFrames2.setBounds(30, 80, 120, 20);
        Color customColor5 = new Color(130, 170, 100);

        pepperoni = new JCheckBox("Pepperoni");
        pepperoni.setBackground(customColor5);
        pepperoni.setBounds(30, 100, 90, 20);
        chesee = new JCheckBox("Extra Cheese");
        chesee.setBackground(customColor5);
        chesee.setBounds(30, 120, 110, 20);
        Mushrooms = new JCheckBox("Mushrooms");
        Mushrooms.setBackground(customColor5);
        Mushrooms.setBounds(30, 140, 110, 20);
        Sausage = new JCheckBox("Sausage");
        Sausage.setBackground(customColor5);
        Sausage.setBounds(30, 160, 90, 20);
        Bourbon = new JCheckBox("Bourbon");
        Bourbon.setBackground(customColor5);
        Bourbon.setBounds(30, 180, 110, 20);
        Onions = new JCheckBox("Onions");
        Onions.setBackground(customColor5);
        Onions.setBounds(30, 200, 90, 20);
        Olives = new JCheckBox("Black Olives");
        Olives.setBackground(customColor5);
        Olives.setBounds(30, 220, 110, 20);

        JPanel jpanel = new JPanel();
        jpanel.setLayout(null);
        jpanel.setBackground(customColor5);
        jpanel.setBounds(10, 70, 150, 190);
        Color customColor = new Color(130, 170, 100); // RGB values for Dodger green
        jpanel.setBorder(BorderFactory.createMatteBorder(10, 15, 15, 10, customColor));

        Psize = new JLabel("Pizza Size");
        Psize.setBackground(customColor5);
        Psize.setBounds(210, 80, 110, 20);
        small = new JRadioButton("Small: $6.50");
        small.setBackground(customColor5);
        small.setBounds(210, 110, 110, 20);
        medium2 = new JRadioButton("Medium: $8.50");
        medium2.setBackground(customColor5);
        medium2.setBounds(210, 140, 110, 20);
        large = new JRadioButton("Large: $10.00");
        large.setBackground(customColor5);
        large.setBounds(210, 170, 110, 20);

        ButtonGroup bg = new ButtonGroup();

        bg.add(small);
        bg.add(medium2);
        bg.add(large);

        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(null);
        jpanel1.setBackground(customColor5);

        jpanel1.setBounds(190, 70, 150, 190);
        Color customColor1 = new Color(130, 170, 100);
        jpanel1.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, customColor1));

        Ptype = new JLabel("Pizza Type");
        Ptype.setBounds(390, 80, 110, 20);
        thin = new JRadioButton("Thin Crust");
        thin.setBackground(customColor5);
        thin.setBounds(390, 110, 110, 20);
        mediumP = new JRadioButton("Medium Crust");
        mediumP.setBackground(customColor5);
        mediumP.setBounds(390, 140, 110, 20);
        pan = new JRadioButton("Pan");
        pan.setBackground(customColor5);
        pan.setBounds(390, 170, 110, 20);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(thin);
        bg1.add(mediumP);
        bg1.add(pan);

        JPanel jpanel2 = new JPanel();
        jpanel2.setLayout(null);
        jpanel2.setBounds(370, 70, 150, 190);
        Color customColor2 = new Color(130, 170, 100);
        jpanel2.setBorder(BorderFactory.createMatteBorder(100, 5, 254, 5, customColor2));

        b1 = new JButton("Process Selection");
        b1.setBounds(150, 280, 220, 30);
        b1.addActionListener(this);

        j5 = new JLabel("Your order: ");
        j5.setBounds(10, 330, 110, 20);

        t1 = new JTextArea("");
        t1.setBounds(10, 360, 510, 70);
        t1.setEditable(false);
        Color customColor3 = new Color(130, 170, 100);
        jFrame.getContentPane().setBackground(customColor3);
        jFrame.pack();

        jFrame.add(t1);
        jFrame.add(b1);
        jFrame.add(small);
        jFrame.add(medium2);
        jFrame.add(large);
        jFrame.add(thin);
        jFrame.add(mediumP);
        jFrame.add(pan);
        jFrame.add(pepperoni);
        jFrame.add(chesee);
        jFrame.add(Mushrooms);
        jFrame.add(Sausage);
        jFrame.add(Bourbon);
        jFrame.add(Onions);
        jFrame.add(Olives);
        jFrame.add(mFrames);
        jFrame.add(mFrames2);
        jFrame.add(Psize);
        jFrame.add(Ptype);
        jFrame.add(j5);
        jFrame.add(jpanel);
        jFrame.add(jpanel1);
        jFrame.add(jpanel2);
        jFrame.setResizable(false);
        jFrame.setSize(550, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        t1.setText("" + getType() + "\n" + getSize() + "\n" + getChoices() + "\nAmount Due: $" + amount);
        amount = 0;
    }

    public String getSize() {
        String s1 = "Pizza Size: ";
        if (small.isSelected()) {
            s1 += "Small";
            amount += 6.50;
        } else if (mediumP.isSelected()) {
            s1 += "Medium";
            amount += 8.50;
        } else if (large.isSelected()) {
            s1 += "Large";
            amount += 10.00;
        }
        return s1;
    }

    public String getType() {
        String s1 = "Pizza Type: ";
        if (thin.isSelected()) {
            s1 += "Thin Crust";
        } else if (mediumP.isSelected()) {
            s1 += "Medium Crust";
        } else if (pan.isSelected()) {
            s1 += "Pan";
        }
        return s1;
    }

    public String getChoices() {
        String s1 = "Toppings: ";
        int counter = 0;
        if (pepperoni.isSelected()) {
            s1 += "Pepperoni, ";
            counter++;
        }
        if (chesee.isSelected()) {
            s1 += "Extra Cheese, ";
            counter++;
        }
        if (Mushrooms.isSelected()) {
            s1 += "Mushrooms, ";
            counter++;
        }
        if (Sausage.isSelected()) {
            s1 += "Sausage, ";
            counter++;
        }
        if (Bourbon.isSelected()) {
            s1 += "Bourbon, ";
            counter++;
        }
        if (Onions.isSelected()) {
            s1 += "Onions, ";
            counter++;
        }
        if (Olives.isSelected()) {
            s1 += "Black Olives, ";
            counter++;
        }
        amount += 1.50 * counter;
        return s1;
    }

    public static void main(String[] args) {
        new labact5();
    }
}