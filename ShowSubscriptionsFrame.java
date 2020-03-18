package nesne;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class ShowSubscriptionsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowSubscriptionsFrame frame = new ShowSubscriptionsFrame();
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
	public ShowSubscriptionsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblSubscribedVehicles = new JLabel("Subscribed Vehicles :");
		lblSubscribedVehicles.setBounds(6, 11, 179, 16);
		contentPane.add(lblSubscribedVehicles);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 54, 408, 186);
		contentPane.add(textPane);
		MainFrame main = new MainFrame();
		textPane.setText(main.autopark.toString());
	}
}
