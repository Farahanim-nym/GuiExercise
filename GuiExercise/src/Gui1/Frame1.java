package Gui1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(38, 37, 167, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 37, 162, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1+num2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e) {
					   JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(38, 121, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1-num2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1) {
					   JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(137, 121, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 192, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(38, 195, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("Divide");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1/num2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1) {
					   JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_2.setBounds(234, 121, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Multiply");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1*num2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1) {
					   JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_3.setBounds(335, 121, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
