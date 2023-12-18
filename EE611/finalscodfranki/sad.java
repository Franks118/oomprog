import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextArea;

public class sad {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_7;
	
	private double total;
	private double total_netPay;
	private double overTime_Rate = 69.7;
	private double hourlyRate;
	private double hoursWorked;
	private double hoursOT;
	private double taxablePay;
	private double SSS;
	private double philHealth;
	private double pagIbig;
	private double total_deductions;
	private double grossPays;
	
	/**
	 * Launch the application.
	 */
	public static void Employee(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sad window = new sad();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1145, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1111, 60);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Payroll Management System");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 41));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 70, 1121, 502);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		textArea.setBounds(793, 106, 285, 275);
		panel_1.add(textArea);

		

		
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				textField_15.setText(null);
				textArea.setText(null);
				textField_17.setText(null);
				
				
				
			}
		});
		btnNewButton.setBounds(455, 10, 120, 30);
		panel_1.add(btnNewButton);
		
		JButton btnNetWages = new JButton("Net Wages");
		btnNetWages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hourlyRate = Double.parseDouble(textField_5.getText());				 
				hoursWorked = Double.parseDouble(textField_6.getText());
				hoursOT = Double.parseDouble(textField_7.getText());
				
				taxablePay = Double.parseDouble(textField_10.getText());
				SSS = Double.parseDouble(textField_11.getText());
				philHealth = Double.parseDouble(textField_12.getText());
				pagIbig = Double.parseDouble(textField_13.getText());
				
				total = (hourlyRate * hoursWorked) + (hoursOT * overTime_Rate);
				String grossPay = String.format("%.2f", total);
				textField_8.setText(grossPay);
				
				total_deductions = taxablePay + SSS + philHealth + pagIbig;
			    String deductions = String.format("%.2f", total_deductions);
				textField_14.setText(deductions);
				 /////////////////////////////////////////////////////////////////
				total_netPay = Double.valueOf(grossPay) - Double.valueOf(total_deductions);
				String formulaNp = String.format("%.2f", total_netPay);
				textField_15.setText(formulaNp);
					
			}
		});
		btnNetWages.setFont(new Font("Arial", Font.BOLD, 15));
		btnNetWages.setBounds(340, 10, 120, 30);
		panel_1.add(btnNetWages);
		
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Single", "Married", "Widow", "Divorce"}));
		comboBox.setBounds(545, 106, 193, 25);
		panel_1.add(comboBox);
		
		JButton btnPaySlip = new JButton("Pay Slip");
		btnPaySlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.append("Pay Date: " + textField_17.getText() + "\n");
				textArea.append("Employer's Name: " + textField.getText() + "\n");
				textArea.append("Employee's Ref No.: " + textField_1.getText() + "\n");
				textArea.append("Employee's Name: " + textField_2.getText() + "\n");
				textArea.append("Employee's Address: " + textField_3.getText() + "\n");
				
				textArea.append("Hourly Rate: " + textField_5.getText() + "\n");
				textArea.append("Hours Worked: " + textField_6.getText() + "\n");
				textArea.append("Overtime: " + textField_7.getText() + "\n");
				textArea.append("Gross Pay: " + textField_8.getText() + "\n");
				
				textArea.append("Civil status: " + comboBox.getSelectedItem().toString() + "\n");
				
				textArea.append("Taxable Pay: " + textField_10.getText() + "\n");
				
				textArea.append("SSS: " + textField_11.getText() + "\n");
				textArea.append("PHILHEALTH: " + textField_12.getText() + "\n");
				textArea.append("PAG-IBIG: " + textField_13.getText() + "\n");
				textArea.append("Total Deductions: " + textField_14.getText() + "\n");
				textArea.append("Net Pay: " + textField_15.getText() + "\n");
				
				
				
				
			}
		});
		btnPaySlip.setFont(new Font("Arial", Font.BOLD, 15));
		btnPaySlip.setBounds(568, 10, 120, 30);
		panel_1.add(btnPaySlip);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Payroll Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD, 15));
		btnExit.setBounds(681, 10, 120, 30);
		panel_1.add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Employer's Name:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(51, 72, 158, 33);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee Ref. No:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(51, 102, 158, 33);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Employee's Name:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(51, 135, 158, 33);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Employee Address:");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(51, 172, 158, 33);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Zip Code:");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(106, 210, 158, 24);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Hourly Rate:");
		lblNewLabel_2_5.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(92, 268, 103, 33);
		panel_1.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Hours Worked:");
		lblNewLabel_2_6.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_6.setBounds(76, 296, 123, 33);
		panel_1.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_8 = new JLabel("Gross Pay:");
		lblNewLabel_2_8.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_8.setBounds(106, 348, 89, 33);
		panel_1.add(lblNewLabel_2_8);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 15));
		textField.setBounds(198, 79, 193, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(198, 109, 193, 24);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(198, 142, 193, 24);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(198, 179, 193, 24);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(198, 210, 193, 24);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(198, 272, 193, 24);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(198, 300, 193, 24);
		panel_1.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.BOLD, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(198, 357, 193, 24);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_3 = new JLabel("Marital State / Taxes");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(483, 79, 180, 21);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Civil Status:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4.setBounds(444, 102, 100, 33);
		panel_1.add(lblNewLabel_4);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial", Font.BOLD, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(545, 141, 193, 24);
		panel_1.add(textField_10);
		
		JLabel lblNewLabel_4_2 = new JLabel("Taxable Pay:");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(441, 135, 103, 33);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Government Contributions");
		lblNewLabel_3_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(482, 209, 203, 21);
		panel_1.add(lblNewLabel_3_1);
		
		
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Philhealth:");
		lblNewLabel_4_2_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2_1.setBounds(452, 268, 92, 33);
		panel_1.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("Pag-Ibig:");
		lblNewLabel_4_2_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2_2.setBounds(465, 296, 79, 33);
		panel_1.add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_4_2_3 = new JLabel("Total Deductions:");
		lblNewLabel_4_2_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2_3.setBounds(401, 320, 143, 33);
		panel_1.add(lblNewLabel_4_2_3);
		
		JLabel lblNewLabel_4_2_4 = new JLabel("Net Pay:");
		lblNewLabel_4_2_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2_4.setBounds(472, 348, 72, 33);
		panel_1.add(lblNewLabel_4_2_4);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("SSS:");
		lblNewLabel_4_2_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2_1_1.setBounds(497, 233, 47, 33);
		panel_1.add(lblNewLabel_4_2_1_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Arial", Font.BOLD, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(545, 237, 193, 24);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Arial", Font.BOLD, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(545, 272, 193, 24);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Arial", Font.BOLD, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(545, 300, 193, 24);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Arial", Font.BOLD, 15));
		textField_14.setColumns(10);
		textField_14.setBounds(545, 327, 193, 24);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Arial", Font.BOLD, 15));
		textField_15.setColumns(10);
		textField_15.setBounds(545, 355, 193, 24);
		panel_1.add(textField_15);
		
		JLabel lblNewLabel_3_2 = new JLabel("Pay Slip");
		lblNewLabel_3_2.setForeground(Color.RED);
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(898, 78, 180, 21);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Pay Date:");
		lblNewLabel_3_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBounds(833, 26, 180, 21);
		panel_1.add(lblNewLabel_3_2_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(919, 23, 158, 24);
		panel_1.add(textField_17);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.BOLD, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(198, 329, 193, 24);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_2_8_1 = new JLabel("Overtime:");
		lblNewLabel_2_8_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2_8_1.setBounds(106, 328, 89, 25);
		panel_1.add(lblNewLabel_2_8_1);
		
		
		
		
	}
}