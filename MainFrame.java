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

public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	public static AutoPark autopark = new AutoPark(15, 3);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ENTER PARK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				EnterFrame entrFrm = new EnterFrame();
				entrFrm.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(40, 31, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnExitPark = new JButton("EXIT PARK");
		btnExitPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ExitFrame extFrm = new ExitFrame();
				extFrm.setVisible(true);
				
			}
		});
		btnExitPark.setBounds(40, 74, 117, 29);
		contentPane.add(btnExitPark);
		
		JButton btnAddSubscription = new JButton("ADD SUBSCRIPTION");
		btnAddSubscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				AddSubscriptionFrame addFrm = new AddSubscriptionFrame();
				addFrm.setVisible(true);
				
			}
		});
		btnAddSubscription.setBounds(40, 126, 167, 29);
		contentPane.add(btnAddSubscription);
		
		JButton btnShowSubscription = new JButton("SHOW SUBSCRIPTION");
		btnShowSubscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ShowSubscriptionsFrame showFrm = new ShowSubscriptionsFrame();
				showFrm.setVisible(true);
				
			}
		});
		btnShowSubscription.setBounds(40, 176, 167, 29);
		contentPane.add(btnShowSubscription);
		
		JButton btnShowParkInformation = new JButton("SHOW PARK INFORMATION");
		btnShowParkInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ShowParkInformationFrame showFrm = new ShowParkInformationFrame();
				showFrm.setVisible(true);
				
			}
		});
		btnShowParkInformation.setBounds(40, 219, 198, 29);
		contentPane.add(btnShowParkInformation);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0); 
				
			}
		});
		btnExit.setBounds(310, 243, 134, 29);
		contentPane.add(btnExit);
	}

}
