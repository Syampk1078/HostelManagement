package hostel.management.system;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import java.sql.*;

import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Menu {

	JFrame secondFrame;
	private JTextField txtSyamPrasad;
	JTextField name;
	private JTextField ph;
	private JTextField aadar;
	private JTextField fName;
	protected String comM;
	protected String comRoom;
	protected String comPaytm;  
	private JLabel msg;
	private JTable table;
	private static JScrollPane scrollPane;
	private JTextField txtSearch;
	private JLabel lblNewLabel;
	protected double extrPayment;
	protected double pending;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.secondFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	
	public void load_table() {
		try {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?useSSL=false","root","1234");
			   
			   
			   PreparedStatement pst = con.prepareStatement("select sNo,name,aadar,Room_no from details ORDER by name asc");
			    ResultSet rs = pst.executeQuery();
			    table.setModel(DbUtils.resultSetToTableModel(rs));
			    rs.close();
			    con.close();
			   
			   
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	public Menu() {
		
		initialize();
		load_table();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		secondFrame = new JFrame();
		secondFrame.getContentPane().setBackground(Color.GRAY);
		secondFrame.setBounds(100, 100, 837, 467);
		secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secondFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 801, 79);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "OWNER", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(null);
		panel.setForeground(Color.GRAY);
		panel.setBackground(Color.LIGHT_GRAY);
		secondFrame.getContentPane().add(panel);
		
		JLabel lblName = new JLabel("ADMIN");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblName.setBounds(37, 8, 94, 57);
		panel.add(lblName);
		
		txtSyamPrasad = new JTextField();
		txtSyamPrasad.setBackground(Color.LIGHT_GRAY);
		txtSyamPrasad.setEditable(false);
		txtSyamPrasad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSyamPrasad.setForeground(new Color(0, 0, 0));
		txtSyamPrasad.setText("K.SYAM PRASAD");
		txtSyamPrasad.setBounds(141, 25, 112, 29);
		panel.add(txtSyamPrasad);
		txtSyamPrasad.setColumns(10);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondFrame.dispose();
				Login_Page obj = new Login_Page();
				obj.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(672, 20, 89, 42);
		panel.add(btnNewButton);
		
		msg = new JLabel("");
		msg.setBounds(263, 30, 281, 25);
		panel.add(msg);
		msg.setFont(new Font("Tahoma", Font.BOLD, 13));
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Add Admission", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 93, 801, 291);
		secondFrame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(35, 28, 119, 27);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTACT");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(35, 56, 119, 27);
		panel_1.add(lblNewLabel_1_1);
		
		name = new JTextField();
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = name.getCaretPosition();
				name.setText(name.getText().toUpperCase());
				name.setCaretPosition(position);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
		});
		name.setColumns(10);
		name.setBounds(194, 28, 168, 20);
		panel_1.add(name);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				ph.setText("");
				aadar.setText("");
				fName.setText("");
				msg.setText("=> Clear <=");
				
				
				name.requestFocus();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(45, 234, 126, 46);
		panel_1.add(btnReset);
		
		JLabel lblNewLabel_1_2 = new JLabel("AADHAR");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(35, 85, 119, 27);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("FATHER NAME");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(35, 113, 136, 27);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("MONTHS");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(35, 144, 119, 27);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("ROOM NO");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_2.setBounds(35, 172, 119, 27);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("PAYMENT");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_4.setBounds(35, 200, 119, 27);
		panel_1.add(lblNewLabel_1_4);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?useSSL=false","root","1234");
					   
					  // String uName = name.getText();
					 //  int contact = Integer.valueOf(ph.getText());
					  // int aadarNo = Integer.valueOf(aadar.getText());
					   
					  // String fatherName = fName.getText();
					   //
					   
					   Statement stmt = con.createStatement();
					   
					 //month,rm,payc
					   //int rNo = Integer.valueOf(rm);
					   
					   String username = "syam";
					   String c = "1234";
					  // String sql = "select name,contact from detail where name='"+username+"' and contact='"+c+"'";
					   
					   
					   
					   
					   if(ph.getText().equals("") || aadar.getText().equals("") || comRoom.equals("")) {
						   msg.setText("=> Missing Field <=");
					   }
					   else {
						   
						   String uName = name.getText();
						   long phone = Long.parseLong(ph.getText());
						   long aaDhar = Long.parseLong(aadar.getText());
						   String fatherName = fName.getText();
						   String monthOf = comM;
						   long roomNumber = Long.parseLong(comRoom);
						   String paytm = comPaytm;
						   
						   String query = "SELECT COUNT(*) FROM details WHERE aadar = ?";
				            PreparedStatement pstmt = con.prepareStatement(query);
				            pstmt.setLong(1, aaDhar);
				            
				            ResultSet resultSet = pstmt.executeQuery();
				            resultSet.next();
				            int count = resultSet.getInt(1);
				            
				            if(count>0) {
				            	JOptionPane.showMessageDialog(btnAdd, "Already Record found");
				            }else {
				            	
				            	
				            	String sql = "insert into details (NAME,CONTACT,AADAR,FNAME,MONTHS,ROOM_NO,PAYMENT) "
								  		+ "values ('"+uName+"',"+phone+","+aaDhar+",'"+fatherName+"','"+monthOf+"'"
								  				+ ","+roomNumber+",'"+paytm+"')";
								   
								  stmt.execute(sql);
								  
								  msg.setText("=> Record Added <=");
								  load_table();
								  
								  
								 
								  if(monthOf.equals("One Month")) {
									  if(paytm.equals("5000")) {
										  
										 
										  
									  }
								  }
				            }
						   
						   
					   }
					   
					   
			            
					   
					   
					  
					  
					   
					   stmt.close();
					   con.close();
					   
						  
						 /* ResultSet rs = stmt.executeQuery(sql);
						  if(rs.next()) {
							   //JOptionPane.showMessageDialog(null, "Connected");
							   
							   
							   
							   String n = rs.getString(1);
							   String c1 = rs.getString(2);
							   
							   name.setText(n);
							   ph.setText(c1);
							   
						  }
					   
					   
					  /* String sql = "insert into detail (NAME,CONTACT,AADAR,FNAME,MONTHS,ROOM_NO,PAYMENT) values (?,?,?,?,?,?,?)";
					   PreparedStatement pst = con.prepareStatement(sql);
					   pst.setString(1, name.getText());
					   pst.setString(2, ph.getText());
					   pst.setString(3, aadar.getText());
					   pst.setString(4, fName.getText());
					   pst.setString(5, "");
					   pst.setString(6, "");
					   pst.setString(7, "");
					   
					   ResultSet rs = pst.executeQuery();
					   
					   JOptionPane.showMessageDialog(btnAdd, "Added");
					   pst.close();
					   rs.close();*/
					   
					  // String temp = comM;
					  // ss.setText(temp);
					   

					   
					   
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(btnAdd, e1);
				}
				
				
				
				
				
				
			}
		});
		
		
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBounds(219, 234, 129, 46);
		panel_1.add(btnAdd);
		
		ph = new JTextField();
		ph.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
				String inp = ph.getText();
				int len = inp.length();
				
				char c = e.getKeyChar();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					if(len<10) {
						ph.setEditable(true);
					}else {
						ph.setEditable(false);
					}
				}
			}
		});
		ph.setColumns(10);
		ph.setBounds(194, 56, 168, 20);
		panel_1.add(ph);
		
		aadar = new JTextField();
		aadar.setColumns(10);
		aadar.setBounds(194, 85, 168, 20);
		panel_1.add(aadar);
		
		fName = new JTextField();
		fName.setColumns(10);
		fName.setBounds(194, 113, 168, 20);
		panel_1.add(fName);
		
		
		
		
		
		JPanel paymentPanel = new JPanel();
		paymentPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		paymentPanel.setBounds(370, 11, 421, 269);
		panel_1.add(paymentPanel);
		paymentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		scrollPane.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		scrollPane.setBounds(10, 25, 401, 233);
		paymentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
	
		
		
		String[] colums = {"","One Month","Three Months","Six Months","Year"};
		JComboBox comboBox = new JComboBox(colums);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indx = comboBox.getSelectedIndex();
				if(indx == 1)
				     comM = colums[1];
				else if(indx == 2)
					comM = colums[2];
				else if(indx == 3)
				     comM = colums[3];
				else if(indx == 4)
					comM = colums[4];

				
			}
		});
		comboBox.setBounds(194, 149, 168, 22);
		panel_1.add(comboBox);
		
		
		String[] roomNo = {"","1","2","3","4","5","6","7"};
		JComboBox comboBox_1 = new JComboBox(roomNo);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indx = comboBox_1.getSelectedIndex();
				if(indx == 1)
				     comRoom = roomNo[1];
				else if(indx == 2)
					comRoom = roomNo[2];
				if(indx == 3)
					comRoom = roomNo[3];
				else if(indx == 4)
					comRoom = roomNo[4];
				else if(indx == 5)
					comRoom = roomNo[5];
				else if(indx == 6)
					comRoom = roomNo[6];
				else if(indx == 7)
					comRoom = roomNo[7];
				
			}
		});
		comboBox_1.setBounds(194, 177, 168, 22);
		panel_1.add(comboBox_1);
		
		String[] paym = {"","5000","15000","30000","60000"};
		
		JComboBox comboBox_2 = new JComboBox(paym);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indx = comboBox_2.getSelectedIndex();
				if(indx == 1)
				     comPaytm = paym[1];
				else if(indx == 2)
					comPaytm = paym[2];
				if(indx == 3)
					comPaytm = paym[3];
				else if(indx == 4)
					comPaytm = paym[4];
				
			}
		});
		comboBox_2.setBounds(194, 205, 168, 22);
		panel_1.add(comboBox_2);
		
		JButton btnPrint = new JButton("PRINT RECIEPT");
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBackground(Color.LIGHT_GRAY);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				int s = Integer.parseInt(txtSearch.getText());
				if(txtSearch.getText().equals("")) {
					msg.setText("Enter Search Id");
					txtSearch.requestFocus();
				}
				else {
				    try {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?useSSL=false","root","1234");
					   String sql = "select Name,fname,room_no,payment,months from details where sNo="+s+"";
					   
					   Statement stmt = con.createStatement();
					//Execute Query
					   ResultSet rs = stmt.executeQuery(sql);
					   
					   if(rs.next()) {
						   //JOptionPane.showMessageDialog(null, "Connected");
						   
						   
						   
						   String name = rs.getString(1);
						   String FName = rs.getString(2);
						   String rNo = rs.getString(3);
						   String pay = rs.getString(4);
						   String month = rs.getString(5);
						   
						   
						   
						   double payment = Double.parseDouble(pay);
						   
						   Bill_Status obj = new Bill_Status();
						   double mnth = 5000.0;
						  
						   int mNt=0;
						   if(month.equals(colums[1])) {
							   cal(1,payment);
							   obj.txtMnt.setText("Rs."+(1*mnth));
						   }else if(month.equals(colums[2])) {
							   cal(3,payment);
							   obj.txtMnt.setText("Rs."+(3*mnth));
						   }else if(month.equals(colums[3])) {
							   cal(6,payment);
							   obj.txtMnt.setText("Rs."+(6*mnth));
						   }else if(month.equals(colums[4])) {
							   cal(12,payment);
							   obj.txtMnt.setText("Rs."+(12*mnth));
						   }
						   
						   double extra = extrPayment;
						   double pendingBal = pending;
						   
						  
						   if(pendingBal == 0) {
							   obj.txtBillMsg.setText("Status : Paid");
						   }
						   else {
							   obj.txtBillMsg.setText("Status : Pending");
						   }
						   
						   
						   obj.txtAdvance.setText("Rs."+extra);
						   obj.txtPaid.setText("Rs."+payment);
						   obj.txtPending.setText("Rs."+pendingBal);
						   
						   
						   obj.textMonth.setText(month);
						   obj.txtName.setText(name);
						   obj.txtFather.setText(FName);
						   obj.txtRoom.setText(rNo);
						   obj.textMonth.setText(month);
						   secondFrame.dispose();
						
							obj.thirdFrame.setVisible(true);
						 
						   
						   
					   }
					   
					   
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(btnAdd, e2);
					
				}
				//paymentPanel.setVisible(false);
				}
				
			}

			private void cal(int i, double payment) {
				// TODO Auto-generated method stub
				double mn = (5000)*i;
			    int res = (int)(mn-payment);
			    String temp = ""+res;
			    if(temp.charAt(0) == '-') {
			    	
			    	extrPayment = Double.parseDouble(temp.substring(1));
			    	pending = 0;
			    	
			    }else if(res == 0){
			    	extrPayment = 0;
			    	pending = 0;
			    }
			    else if(res>0) {
			    	pending = res;
			    	extrPayment = 0;
			    	
			    }
				
			}
		});
		btnPrint.setBounds(467, 391, 281, 30);
		secondFrame.getContentPane().add(btnPrint);
		
		lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 391, 81, 26);
		secondFrame.getContentPane().add(lblNewLabel);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(198, 395, 162, 26);
		secondFrame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
	}
}
