package nesne;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExitFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblMinute;
	private JTextField textField_2;
	private JButton btnEnter;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExitFrame frame = new ExitFrame();
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
	public ExitFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlateNumber = new JLabel("Plate Number :");
		lblPlateNumber.setBounds(30, 47, 97, 30);
		contentPane.add(lblPlateNumber);
		
		textField = new JTextField();
		textField.setBounds(139, 49, 178, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour :");
		lblHour.setBounds(30, 89, 47, 30);
		contentPane.add(lblHour);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 91, 61, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblMinute = new JLabel("Minute :");
		lblMinute.setBounds(30, 131, 61, 30);
		contentPane.add(lblMinute);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 133, 61, 26);
		contentPane.add(textField_2);
		
		btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame main = new MainFrame();
				Time time = new Time(Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()));
				
				main.autopark.vehicleExits(textField.getText(), time);
				JOptionPane.showMessageDialog(null, "Basariyla cikarildi!");
			}
		});
		btnEnter.setBounds(189, 104, 117, 50);
		contentPane.add(btnEnter);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				MainFrame main = new MainFrame();
				main.setVisible(true);
				
			}
		});
		btnBack.setBounds(327, 6, 117, 29);
		contentPane.add(btnBack);
	}

}
