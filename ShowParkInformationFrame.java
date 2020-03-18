package nesne;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowParkInformationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowParkInformationFrame frame = new ShowParkInformationFrame();
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
	public ShowParkInformationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				MainFrame main = new MainFrame();
				main.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(303, 211, 117, 29);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 30, 408, 168);
		contentPane.add(textPane);
		MainFrame main = new MainFrame();
		textPane.setText(main.autopark.showParkInfo());
		
		JLabel lblNewLabel = new JLabel("AutoPark ParkRecords :");
		lblNewLabel.setBounds(12, 13, 155, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblDailyIncome = new JLabel("Daily Income :");
		lblDailyIncome.setBounds(22, 217, 91, 16);
		contentPane.add(lblDailyIncome);
		
		textField = new JTextField();
		textField.setText(main.autopark.getIncome() + "");
		textField.setBounds(111, 214, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
