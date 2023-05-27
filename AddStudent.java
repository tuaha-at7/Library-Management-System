import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

public class AddStudent implements ActionListener {       // Add Student Class

    JFrame frame;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,btnback;
		
		public void add() {
		
			frame = new JFrame("LIBRARY MANAGEMENT APP");      // Add Student Frame
			frame.setBounds(100, 100, 732, 423);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(64, 224, 208));
			panel.setBounds(0, 0, 716, 384);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Issue Book");       // Add Student Title (At Top Of Frame)
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
			lblNewLabel.setBounds(0, 11, 716, 60);
			panel.add(lblNewLabel);
			
			JLabel l1 = new JLabel("Student Name");
			l1.setBounds(10, 87, 90, 27);
			panel.add(l1);
			
			t1 = new JTextField();
			t1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t1.setBounds(130, 85, 219, 30);
			panel.add(t1);
			t1.setColumns(10);
			
			t2 = new JTextField();
			t2.setColumns(10);
			t2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t2.setBounds(130, 134, 219, 30);
			panel.add(t2);
			
			JLabel lblFatherName = new JLabel("Father Name");
			lblFatherName.setBounds(10, 136, 110, 27);
			panel.add(lblFatherName);
			
			t3 = new JTextField();
			t3.setColumns(10);
			t3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t3.setBounds(130, 185, 219, 30);
			panel.add(t3);
			
			JLabel lblId = new JLabel("ID");
			lblId.setBounds(10, 187, 46, 27);
			panel.add(lblId);
			
			t4 = new JTextField();
			t4.setColumns(10);
			t4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t4.setBounds(130, 237, 219, 30);
			panel.add(t4);
			
			JLabel lblSection = new JLabel("Department");
			lblSection.setBounds(10, 239, 110, 27);
			panel.add(lblSection);
			
			t5 = new JTextField();
			t5.setColumns(10);
			t5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t5.setBounds(130, 289, 219, 30);
			panel.add(t5);
			
			JLabel lblPhoneNumber = new JLabel("Phone Number");
			lblPhoneNumber.setBounds(10, 291, 110, 27);
			panel.add(lblPhoneNumber);
			
			t7 = new JTextField();
			t7.setColumns(10);
			t7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t7.setBounds(487, 103, 219, 30);
			panel.add(t7);
			
			JLabel lblroom = new JLabel("Issue Date");
			lblroom.setBounds(367, 105, 110, 27);
			panel.add(lblroom);
			
			t8 = new JTextField();
			t8.setColumns(10);
			t8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t8.setBounds(487, 154, 219, 30);
			panel.add(t8);
			
			JLabel lblBeds = new JLabel("Return Date");
			lblBeds.setBounds(367, 156, 110, 27);
			panel.add(lblBeds);
			
			t6 = new JTextField();
			t6.setColumns(10);
			t6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t6.setBounds(130, 343, 219, 30);
			panel.add(t6);
			
			JLabel lblmblnumber = new JLabel("Book Name");
			lblmblnumber.setBounds(10, 345, 150, 27);
			panel.add(lblmblnumber);
			
			t9 = new JTextField();
			t9.setColumns(10);
			t9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			t9.setBounds(487, 205, 219, 30);
			panel.add(t9);
			  
			JLabel lblHomeAddress = new JLabel("Returned?");
			lblHomeAddress.setBounds(367, 207, 110, 27);
			panel.add(lblHomeAddress);
		
			b1 = new JButton("Issue");
			b1.setFocusable(false);
			b1.setBackground(Color.ORANGE);
			b1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
			b1.setBounds(497, 260, 89, 43);
			b1.addActionListener(this);
			panel.add(b1);
		
			btnback = new JButton("Back");
			btnback.setFocusable(false);
			btnback.setBackground(Color.ORANGE);
			btnback.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
			btnback.setBounds(497, 318, 89, 43);
			btnback.addActionListener(this);
			panel.add(btnback);
	
}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==btnback) {
				Menu mu=new Menu();
				mu.menu1();
				frame.setVisible(false);
				mu.frame.setVisible(true);
				
			}
			else
			{
				try {
					Connection conc=CP.createC();
					String q="insert into student(studentname,fathername,id,department,phonenumber,book,issuedate,returndate,status) values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement pstmt= conc.prepareStatement(q);
					
					pstmt.setString(1,t1.getText());
					pstmt.setString(2,t2.getText());
					pstmt.setString(3,t3.getText());
					pstmt.setString(4,t4.getText());
					pstmt.setString(5,t5.getText());
					pstmt.setString(6,t6.getText());
					pstmt.setString(7,t7.getText());
					pstmt.setString(8,t8.getText());
					pstmt.setString(9,t9.getText());
					pstmt.executeUpdate();
					
					JOptionPane.showMessageDialog(null,"Book Issued!");
				} catch (Exception ev) {
					// TODO Auto-generated catch block
					ev.printStackTrace();
					JOptionPane.showMessageDialog(null,"Error ! Book Not Issued");
				}
		}		
	}  
}
