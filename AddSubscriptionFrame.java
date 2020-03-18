package nesne;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.EventQueue;

public class AddSubscriptionFrame extends JFrame {

	private JFrame add;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSubscriptionFrame frame = new AddSubscriptionFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddSubscriptionFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlateNumber = new JLabel("PLATE NUMBER :");
		lblPlateNumber.setBounds(16, 34, 110, 24);
		contentPane.add(lblPlateNumber);
		
		textField = new JTextField();
		textField.setBounds(138, 33, 165, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBegin = new JLabel("BEGIN");
		lblBegin.setBounds(106, 70, 61, 16);
		contentPane.add(lblBegin);
		
		JLabel lblEnd = new JLabel("END");
		lblEnd.setBounds(234, 71, 61, 16);
		contentPane.add(lblEnd);
		
		JLabel lblNewLabel = new JLabel("DAY :");
		lblNewLabel.setBounds(16, 115, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MONTH :");
		lblNewLabel_1.setBounds(16, 155, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("YEAR :");
		lblNewLabel_2.setBounds(16, 195, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 110, 80, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 150, 80, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 190, 80, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(223, 110, 80, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(223, 150, 80, 26);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(223, 190, 80, 26);
		contentPane.add(textField_6);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				MainFrame main = new MainFrame();
				main.setVisible(true);
				
			}
		});
		btnBack.setBounds(327, 6, 117, 29);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("ENTER");
		
		DefaultListModel dlm = new DefaultListModel();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date begin = new Date(Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()), Integer.parseInt(textField_3.getText()));
				Date end = new Date(Integer.parseInt(textField_4.getText()), Integer.parseInt(textField_5.getText()), Integer.parseInt(textField_6.getText()));
				
				String plate = textField.getText();
				SubscribedVehicle sub = new SubscribedVehicle(plate, begin, end);
				Subscription subscription = new Subscription(begin, end, sub);
				MainFrame main = new MainFrame();
				main.autopark.addVehicle(sub);
				
				JOptionPane.showMessageDialog(null, "Basariyla Eklendi!");
			}
		});
		btnNewButton.setBounds(327, 243, 117, 29);
		contentPane.add(btnNewButton);
		
	
	}
}
