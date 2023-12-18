import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maintest {

    public JFrame frame;
    public JTextField[] textFields;
    public double total, hourlyRate, hoursWorked, hoursOT, overTime_Rate;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Maintest window = new Maintest();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Maintest() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        textFields = new JTextField[8];
        for (int i = 0; i < 8; i++) {
            textFields[i] = new JTextField();
            textFields[i].setFont(new Font("Arial", Font.BOLD, 15));
        }

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        for (int i = 0; i < 8; i++) {
            hGroup.addComponent(textFields[i]);
            vGroup.addComponent(textFields[i], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE);
        }

        layout.setHorizontalGroup(hGroup);
        layout.setVerticalGroup(vGroup);

        JButton btnCalculateGrossPay = new JButton("Calculate Gross Pay");
        btnCalculateGrossPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateGrossPay();
            }
        });

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalculateGrossPay)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(textFields[0])
                                .addComponent(textFields[1])
                                .addComponent(textFields[2]))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(textFields[3])
                                .addComponent(textFields[4])
                                .addComponent(textFields[5]))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(textFields[6])
                                .addComponent(textFields[7]))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCalculateGrossPay)
                                .addComponent(btnReset))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textFields[0])
                                .addComponent(textFields[1])
                                .addComponent(textFields[2]))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textFields[3])
                                .addComponent(textFields[4])
                                .addComponent(textFields[5]))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textFields[6])
                                .addComponent(textFields[7]))
        );
    }

    private void calculateGrossPay() {
        try {
            hourlyRate = Double.parseDouble(textFields[4].getText());
            hoursWorked = Double.parseDouble(textFields[5].getText());
            hoursOT = Double.parseDouble(textFields[6].getText());

            total = (hourlyRate * hoursWorked) + (hoursOT * overTime_Rate);
            textFields[7].setText(String.format("%.2f", total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numeric values for calculation.");
        }
    }

    private void resetFields() {
        for (JTextField textField : textFields) {
            textField.setText(null);
        }
    }
}
