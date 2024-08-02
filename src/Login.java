import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.io.*;

public class Login {

	private static JFrame frame;
	private JLabel showStatus;
	private JTextField textField_User;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
					frame.setTitle("Soccer Purple rose");
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage("0187abdb2d4eae166f780871c63de163.jpg"));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.desktop);
		frame.setBounds(100, 100, 544, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel Username = new JLabel("\u0E0A\u0E37\u0E48\u0E2D\u0E1C\u0E39\u0E49\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19");
		Username.setForeground(new Color(153, 0, 255));
		Username.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(Username);

		JLabel Password = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		Password.setForeground(new Color(153, 0, 255));
		Password.setFont(new Font("Tahoma", Font.PLAIN, 20));

		textField_User = new JTextField();
		textField_User.setForeground(new Color(0, 204, 51));
		textField_User.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_User.setColumns(10);

		JButton btnLogin = new JButton("เข้าสู่ระบบ");
		btnLogin.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				boolean check = true;
				try {
					BufferedReader read = new BufferedReader(new FileReader("Account.txt"));
					String temp = "";
					while ((temp = read.readLine()) != null) {
						String[] data = temp.split("\t");
						String username = textField_User.getText();
					 	String password = passwordField.getText();
					 	
						if (username.equals(data[2]) && password.equals(data[3])) {
							check = false;
							showStatus.setText("Status : Success");
							pitch_rental_schedule frame = new pitch_rental_schedule();
							frame.main(null);
							break;
						}
						if(check) {
							showStatus.setText("Status : Fail");							
						}
						else {							
							showStatus.setText("Status : Success");
							pitch_rental_schedule frame = new pitch_rental_schedule();
							frame.main(null);
						}
						
					}
					read.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(153, 0, 255));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton btnCreateAccount = new JButton("\u0E25\u0E07\u0E17\u0E30\u0E40\u0E1A\u0E35\u0E22\u0E19");
		btnCreateAccount.setForeground(new Color(255, 255, 255));
		btnCreateAccount.setBackground(new Color(153, 0, 255));
		btnCreateAccount.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Create_Account frame = new Create_Account();
				frame.main(null);
			}
		});
		btnCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JLabel lblNewLabel = new JLabel("\u0E40\u0E02\u0E49\u0E32\u0E2A\u0E39\u0E48\u0E23\u0E30\u0E1A\u0E1A");
		lblNewLabel.setForeground(new Color(153, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(new Color(51, 204, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setForeground(new Color(51, 204, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));

		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 204, 51));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));

		this.showStatus = new JLabel("Status : ");
		showStatus.setForeground(new Color(153, 0, 255));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(218)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(Username)
							.addGap(6)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textField_User, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(Password)
							.addGap(6)
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnCreateAccount, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
								.addComponent(showStatus))))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(Username, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_User, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(Password, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnCreateAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(showStatus)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}