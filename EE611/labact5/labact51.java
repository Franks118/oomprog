import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;

public class labact51 implements ActionListener {
    JLabel kJLabel;
    JList<String> list1;
    JTextArea ta;
    JButton btn;
    double total = 0.00;

    public labact51() {
        Color customColor3 = new Color(130, 200, 195);
        JFrame m = new JFrame("EL NINO CHUBRA");
        kJLabel = new JLabel("El Nino ");
        kJLabel.setBackground(customColor3);
        kJLabel.setBounds(10, 10, 190, 20);
        kJLabel.setFont(new Font("Arial", Font.BOLD, 25));

        m.getContentPane().setBackground(customColor3);
        m.setResizable(false);
        DefaultListModel<String> menu = new DefaultListModel<>();

        menu.addElement("Pita $5.93");
        menu.addElement("Patatas bravas $9.02");
        menu.addElement("Doritos $5.20");
        menu.addElement("Chicken roll $8.97");
        menu.addElement("Taco $3.54");
        menu.addElement("Croquettes $2.47");
        menu.addElement("Manchanita $9.98");
        menu.addElement("Paella $1.25");
        menu.addElement("Rocky road Ice Cream $7.92");
        menu.addElement("Tequila $3.55");
        menu.addElement("Sprite $7.15");

        list1 = new JList<>(menu);
        list1.setBackground(customColor3);
        list1.setFixedCellHeight(30);
        list1.setBounds(10, 50, 180, 380);
        Color customColor1 = new Color(100, 195, 220);
        ta = new JTextArea();
        ta.setBackground(customColor1);
        ta.setBounds(250, 50, 200, 330);

        btn = new JButton("Selection Completed");

        btn.setBounds(10, 380, 460, 30);
        btn.addActionListener(this);
        Color customColor7 = new Color(255, 245, 255);
        btn.setBackground(customColor7);
        m.add(btn);
        m.add(ta);
        m.add(list1);
        m.add(kJLabel);

        m.setSize(500, 500);
        m.setLayout(null);
        m.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String s1 = "               El Nino petagora\n\n-----------------Welcome-----------------\n\n";

        for (Object selection : list1.getSelectedValues()) {
            s1 += selection + "\n";
        }
        getTotal();
        s1 += "\nSUB TOTAL:     $" + formatter.format(total) + "\nTAX:                    $0.62"
                + "\nTOTAL                $"
                + formatter.format(total - 0.62)
                + "\n"
                + "\n         Thank you - Have a nice Day";

        ta.setText(s1);
        total = 0;
    }

    public void getTotal() {
        double add = 0;
        for (int i = 0; i < 10; i++) {
            if (list1.isSelectedIndex(i)) {
                switch (i) {
                    case 0:
                        add += 5.93;
                        break;
                    case 1:
                        add += 9.02;
                        break;
                    case 2:
                        add += 5.20;
                        break;
                    case 3:
                        add += 8.97;
                        break;
                    case 4:
                        add += 3.54;
                        break;
                    case 5:
                        add += 2.47;
                        break;
                    case 6:
                        add += 9.98;
                        break;
                    case 7:
                        add += 1.25;
                        break;
                    case 8:
                        add += 7.92;
                        break;
                    case 9:
                        add += 3.55;
                        break;
                    case 10:
                        add += 7.15;
                        break;
                }

            }
        }
        total = add;
    }

    public static void main(String[] args) {
        new labact51();
    }
}