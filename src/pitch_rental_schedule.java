import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class pitch_rental_schedule {

	private static JFrame frame;
	private JLabel showStatus;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pitch_rental_schedule window = new pitch_rental_schedule();
					window.frame.setVisible(true);
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage("0187abdb2d4eae166f780871c63de163.jpg"));
					frame.setTitle("pitch rental schedule");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pitch_rental_schedule() {
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

		JLabel lblPitch = new JLabel("สนาม");
		lblPitch.setForeground(new Color(153, 0, 255));
		lblPitch.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JComboBox comboBox_Pitch = new JComboBox();
		comboBox_Pitch.setModel(new DefaultComboBoxModel(
				new String[] { "", "สนาม 1", "สนาม 2", "สนาม 3", "สนาม 4", "สนาม 5", "สนามหญ้าจริง", "สนามทราย" }));
		comboBox_Pitch.setForeground(new Color(0, 204, 51));
		comboBox_Pitch.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblPitch_1 = new JLabel("ว/ด/ป");
		lblPitch_1.setForeground(new Color(153, 0, 255));
		lblPitch_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JComboBox comboBox_Day = new JComboBox();
		comboBox_Day.setModel(new DefaultComboBoxModel(new String[] { "", "01", "02", "03", "04", "05", "06", "07",
				"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31" }));
		comboBox_Day.setForeground(new Color(0, 204, 51));
		comboBox_Day.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1 = new JLabel("-\r\n");
		lblNewLabel_1_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JComboBox comboBox_Month = new JComboBox();
		comboBox_Month.setModel(new DefaultComboBoxModel(new String[] {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12  "}));
		comboBox_Month.setForeground(new Color(0, 204, 51));
		comboBox_Month.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblPitch_1_1 = new JLabel("เวลา");
		lblPitch_1_1.setForeground(new Color(153, 0, 255));
		lblPitch_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JComboBox comboBox_Time_1 = new JComboBox();
		comboBox_Time_1.setModel(new DefaultComboBoxModel(new String[] { "", "06", "07", "08", "09", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));
		comboBox_Time_1.setForeground(new Color(0, 204, 51));
		comboBox_Time_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_1 = new JLabel(":");
		lblNewLabel_1_1_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JComboBox comboBox_Time_2 = new JComboBox();
		comboBox_Time_2.setModel(new DefaultComboBoxModel(new String[] {"", "00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
		comboBox_Time_2.setForeground(new Color(0, 204, 51));
		comboBox_Time_2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_2 = new JLabel("-\r\n");
		lblNewLabel_1_1_2.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JComboBox comboBox_Time_3 = new JComboBox();
		comboBox_Time_3.setModel(new DefaultComboBoxModel(new String[] { "", "06", "07", "08", "09", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));
		comboBox_Time_3.setForeground(new Color(0, 204, 51));
		comboBox_Time_3.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_1_1 = new JLabel(":");
		lblNewLabel_1_1_1_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JComboBox comboBox_Time_4 = new JComboBox();
		comboBox_Time_4.setModel(new DefaultComboBoxModel(new String[] {"", "00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
		comboBox_Time_4.setForeground(new Color(0, 204, 51));
		comboBox_Time_4.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JComboBox comboBox_year = new JComboBox();
		comboBox_year.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_year.setModel(new DefaultComboBoxModel(
				new String[] { "", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
						"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
						"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
		comboBox_year.setForeground(new Color(0, 204, 51));
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 204, 51));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);

		JButton btnSave = new JButton("บันทึก");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = true; // true: Pitch is available
				try {
					File filename = new File("Pitch.txt");
			    	String year = comboBox_year.getSelectedItem().toString()+"-"+comboBox_Month.getSelectedItem().toString()+"-"+comboBox_Day.getSelectedItem().toString();
					String pitch = comboBox_Pitch.getSelectedItem().toString();
					String startTime = comboBox_Time_1.getSelectedItem().toString() + ":"+ comboBox_Time_2.getSelectedItem().toString();							
					String endTime = comboBox_Time_3.getSelectedItem().toString() + ":"	+ comboBox_Time_4.getSelectedItem().toString();
					// Validate data
					String s;
					if (filename.exists()) {
						BufferedReader read = new BufferedReader(new FileReader("Pitch.txt"));
						String temp = "";
						while ((temp = read.readLine()) != null) {
							String[] data = temp.split("\t");
							if(data.length>3)
							{
						        // Pitch,Date,StartTime,EndTime
								// startTime.compareTo(data[3])  positive startTime > data[3]
								//s = "c1:" +startTime.compareTo(data[3])+", c2:" +endTime.compareTo(data[2])+", c3:" +pitch.compareTo(data[0])+", c4"+year.compareTo(data[1]);
								if (startTime.compareTo(data[3]) < 0 && endTime.compareTo(data[2])>0 && pitch.compareTo(data[0])==0 ) {
									showStatus.setText(data[0]+data[1]+data[2]+data[3]+data[4]);
									check = false;									
									break;
								}
							}
						}
						read.close();
					}

					// Write to text file
					if (check) {
						showStatus.setText("Status : save file");
						PrintWriter write = new PrintWriter(new FileWriter("Pitch.txt", true));
						BufferedReader read = new BufferedReader(new FileReader("Account.txt"));
						String temp = "";
						String c = textField.getText();
						while ((temp = read.readLine()) != null) {
							String[] data = temp.split("\t");
							String Customer = "( "+data[0]+":"+data[1]+" )";
							if(c.equals(data[2])) {
								write.println(pitch + "\t"+year+"\t"+startTime+"\t"+endTime+"\t"+Customer);
								break;
							}						
						}
						write.close();
						read.close();
					}
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Sorry, cannot save file...");
					System.out.println(ex.getMessage());
				}
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(153, 0, 255));

		JLabel lblNewLabel = new JLabel("จองสนาม");
		lblNewLabel.setForeground(new Color(153, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));

		this.showStatus = new JLabel("Status : ");
		showStatus.setForeground(new Color(153, 0, 255));

		JLabel lblNewLabel_1_1_3 = new JLabel("-\r\n");
		lblNewLabel_1_1_3.setForeground(new Color(153, 0, 255));
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("ชื่อผู้ใช้");
		lblNewLabel_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(showStatus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPitch_1_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPitch_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox_Day, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_Month, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(lblNewLabel_1_1_3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_year, 0, 94, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox_Time_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_Time_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_Time_3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_Time_4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPitch)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox_Pitch, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblNewLabel_1)
											.addGap(10)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
									.addGap(34)))
							.addContainerGap(77, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPitch, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_Pitch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPitch_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_Day, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_Month, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_year, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(8)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPitch_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_Time_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_Time_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_Time_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_Time_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(showStatus, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
