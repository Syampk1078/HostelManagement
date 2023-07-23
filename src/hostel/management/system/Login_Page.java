package hostel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Login_Page {

	JFrame frame;
	private JTextField id;
	private JPasswordField pass;
	private JLabel msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 837, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBounds(10, 11, 801, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOSTEL OWNER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(300, 11, 220, 57);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 101, 801, 291);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("OWNER ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(47, 47, 246, 65);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(47, 141, 246, 65);
		panel_1.add(lblNewLabel_1_1);
		
		id = new JTextField();
		id.setBounds(359, 71, 279, 27);
		panel_1.add(id);
		id.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   
					   String name = id.getText();
					   String password = pass.getText();
					   
					   if(name.equals("admin") && password.equals("password")) {
						   msg.setText("=> Login Successful <=");
						   frame.dispose();
						   //Dashboard nxtPage = new Dashboard();
						   Menu obj = new Menu();
						   obj.secondFrame.setVisible(true);
						   obj.name.requestFocus();
						   
						   
						   
					   }
					   else if(name.equals("") && password.equals("")) {
						   msg.setText("=> Please Login Details <=");
					   }
					   else if(name.equals("")) {
						   msg.setText("=> Enter admin Id <=");
						
					   }
					   else if(password.equals("")) {
						   msg.setText("=> Enter Password <=");
					   }
					   else {
						   msg.setText("=> Incorrect Password <=");
					   }
					   
					   
				
				
				
			}
		});
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnLogin.setBounds(305, 221, 180, 46);
		panel_1.add(btnLogin);
		
		pass = new JPasswordField();
		pass.setBounds(359, 160, 279, 27);
		panel_1.add(pass);
		
		msg = new JLabel("");
		msg.setFont(new Font("Tahoma", Font.BOLD, 13));
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setBounds(314, 395, 200, 34);
		frame.getContentPane().add(msg);
	}
}
