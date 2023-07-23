package hostel.management.system;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bill_Status {

	JFrame thirdFrame;
	JTextField txtName;
	JTextField txtFather;
	JTextField txtRoom;
	JTextField textMonth;
	JTextField txtPending;
    JTextField txtAdvance;
	JTextField txtPaid;
	JTextField txtMnt;
	JLabel txtBillMsg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill_Status window = new Bill_Status();
					window.thirdFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bill_Status() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		thirdFrame = new JFrame();
		thirdFrame.getContentPane().setBackground(Color.GRAY);
		thirdFrame.getContentPane().setForeground(Color.DARK_GRAY);
		thirdFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.GRAY);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "BILL_STATUS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 801, 79);
		thirdFrame.getContentPane().add(panel);
		
		JLabel msg = new JLabel("WELCOME");
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setFont(new Font("Tahoma", Font.BOLD, 24));
		msg.setBounds(261, 11, 281, 57);
		panel.add(msg);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				thirdFrame.dispose();
				Menu obj = new Menu();
				obj.secondFrame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(684, 22, 89, 42);
		panel.add(btnBack);
		
		txtBillMsg = new JLabel("");
		txtBillMsg.setHorizontalAlignment(SwingConstants.CENTER);
		txtBillMsg.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtBillMsg.setBounds(10, 30, 281, 25);
		panel.add(txtBillMsg);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 93, 801, 291);
		thirdFrame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(39, 51, 119, 27);
		panel_1.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setBounds(168, 58, 228, 20);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("FATHER");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(39, 101, 119, 27);
		panel_1.add(lblNewLabel_1_1);
		
		txtFather = new JTextField();
		txtFather.setEditable(false);
		txtFather.setColumns(10);
		txtFather.setBounds(168, 108, 228, 20);
		panel_1.add(txtFather);
		
		JLabel lblNewLabel_1_2 = new JLabel("ROOM NO");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(39, 154, 119, 27);
		panel_1.add(lblNewLabel_1_2);
		
		txtRoom = new JTextField();
		txtRoom.setEditable(false);
		txtRoom.setColumns(10);
		txtRoom.setBounds(168, 161, 228, 20);
		panel_1.add(txtRoom);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("MONTHS");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(39, 209, 119, 27);
		panel_1.add(lblNewLabel_1_2_1);
		
		textMonth = new JTextField();
		textMonth.setEditable(false);
		textMonth.setColumns(10);
		textMonth.setBounds(168, 216, 228, 20);
		panel_1.add(textMonth);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Bill Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(417, 11, 374, 269);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total Bill");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(10, 42, 153, 27);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Paid Amount");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3_1.setBounds(10, 93, 153, 27);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Pending Amount");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3_2.setBounds(10, 145, 153, 27);
		panel_2.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Advance Payment");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3_3.setBounds(10, 199, 153, 27);
		panel_2.add(lblNewLabel_1_3_3);
		
		txtPending = new JTextField();
		txtPending.setEditable(false);
		txtPending.setBounds(207, 151, 152, 20);
		panel_2.add(txtPending);
		txtPending.setColumns(10);
		
		txtAdvance = new JTextField();
		txtAdvance.setEditable(false);
		txtAdvance.setColumns(10);
		txtAdvance.setBounds(207, 199, 152, 20);
		panel_2.add(txtAdvance);
		
		txtPaid = new JTextField();
		txtPaid.setEditable(false);
		txtPaid.setColumns(10);
		txtPaid.setBounds(207, 99, 152, 20);
		panel_2.add(txtPaid);
		
		txtMnt = new JTextField();
		txtMnt.setEditable(false);
		txtMnt.setColumns(10);
		txtMnt.setBounds(207, 48, 152, 20);
		panel_2.add(txtMnt);
		
		JLabel lblThanksForVisiting = new JLabel("!! THANKS FOR VISITING  !!");
		lblThanksForVisiting.setHorizontalAlignment(SwingConstants.CENTER);
		lblThanksForVisiting.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThanksForVisiting.setBounds(283, 395, 281, 25);
		thirdFrame.getContentPane().add(lblThanksForVisiting);
		thirdFrame.setBounds(100, 100, 837, 467);
		thirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
