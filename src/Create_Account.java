import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Create_Account {

	private static JFrame frame;
	private static JTextField textField_1;
	private static JTextField textField;
	private static JTextField textField_2;
	private static JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_Account window = new Create_Account();
					window.frame.setVisible(true);

					frame.setTitle("Create Account");
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
	public Create_Account() {
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

		JLabel lblNewLabel = new JLabel("\u0E25\u0E07\u0E17\u0E30\u0E40\u0E1A\u0E35\u0E22\u0E19");
		lblNewLabel.setForeground(new Color(153, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1 = new JLabel("\u0E0A\u0E37\u0E48\u0E2D-\u0E19\u0E32\u0E21\u0E2A\u0E01\u0E38\u0E25");
		lblNewLabel_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setForeground(new Color(51, 204, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JLabel lblNewLabel_1_2 = new JLabel("\u0E0A\u0E37\u0E48\u0E2D\u0E1C\u0E39\u0E49\u0E43\u0E0A\u0E49");
		lblNewLabel_1_2.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_1 = new JLabel("*");
		lblNewLabel_1_1_1.setForeground(new Color(51, 204, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JLabel lblNewLabel_1_3 = new JLabel(
				"\u0E40\u0E1A\u0E2D\u0E23\u0E4C\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C");
		lblNewLabel_1_3.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_2 = new JLabel("*");
		lblNewLabel_1_1_2.setForeground(new Color(51, 204, 0));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JLabel lblNewLabel_1_2_1 = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		lblNewLabel_1_2_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_2_1 = new JLabel("*");
		lblNewLabel_1_1_2_1.setForeground(new Color(51, 204, 0));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton btnSave = new JButton("\u0E25\u0E07\u0E17\u0E30\u0E40\u0E1A\u0E35\u0E22\u0E19");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				try {
					PrintWriter write = new PrintWriter(new FileWriter("Account.txt", true));
					String Fullname = textField.getText();
					String Phone_number = textField_1.getText();
					String userName = textField_2.getText();
					String password = textField_3.getText();
					write.println(Fullname + "\t" + Phone_number + "\t" + userName + "\t" + password);
					write.close();
					Login frame = new Login();
					frame.main(null);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Sorry, cannot save file...");
				}
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(153, 0, 255));

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 204, 51));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);

		textField = new JTextField();
		textField.setForeground(new Color(0, 204, 51));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 204, 51));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 204, 51));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(184).addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup().addGap(40).addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup().addComponent(lblNewLabel_1)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(
														lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 18,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addComponent(lblNewLabel_1_2)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 18,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 192,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 192,
												GroupLayout.PREFERRED_SIZE))
										.addGap(44)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 192,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 192,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblNewLabel_1_2_1)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE,
																18, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblNewLabel_1_3)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 18,
																GroupLayout.PREFERRED_SIZE)))))))
				.addContainerGap(60, GroupLayout.PREFERRED_SIZE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(22)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1).addComponent(lblNewLabel_1_1,
												GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(36, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);
	}
}
