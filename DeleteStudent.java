import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

public class DeleteStudent implements ActionListener{              // Delete Student Class
	
    JFrame frame;	
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	JButton b1,btnback,btnsearch;
	
	public void deletest1() {
		
		frame = new JFrame("LIBRARY MANAGEMENT APP");                // Delete Student Frame
		frame.setBounds(100, 100, 732, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 716, 384);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Record");               // Delete Student Title (At Top Of Frame)
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 11, 716, 60);
		panel.add(lblNewLabel);
		
		JLabel l1 = new JLabel("ID");
		l1.setBounds(10, 87, 90, 27);
		panel.add(l1);
		
		t1 = new JTextField();
		t1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t1.setBounds(130, 85, 110, 30);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.WHITE);
		t2.setDisabledTextColor(Color.BLACK);
		t2.setEditable(false);
		t2.setColumns(10);
		t2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t2.setBounds(130, 134, 219, 30);
		panel.add(t2);
		
		JLabel lblname = new JLabel("Student Name");
		lblname.setBounds(10, 136, 110, 27);
		panel.add(lblname);
		
		t3 = new JTextField();
		t3.setBackground(Color.WHITE);
		t3.setDisabledTextColor(Color.BLACK);
		t3.setEditable(false);
		t3.setColumns(10);
		t3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t3.setBounds(130, 185, 219, 30);
		panel.add(t3);
		
		JLabel lblfathname = new JLabel("Father Name");
		lblfathname.setBounds(10, 187, 110, 27);
		panel.add(lblfathname);
		
		t4 = new JTextField();
		t4.setBackground(Color.WHITE);
		t4.setDisabledTextColor(Color.BLACK);
		t4.setEditable(false);
		t4.setColumns(10);
		t4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t4.setBounds(130, 237, 219, 30);
		panel.add(t4);
		
		JLabel lblSection = new JLabel("Department");
		lblSection.setBounds(10, 239, 110, 27);
		panel.add(lblSection);
		
		t5 = new JTextField();
		t5.setBackground(Color.WHITE);
		t5.setDisabledTextColor(Color.BLACK);
		t5.setEditable(false);
		t5.setColumns(10);
		t5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t5.setBounds(130, 289, 219, 30);
		panel.add(t5);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(10, 291, 110, 27);
		panel.add(lblPhoneNumber);
		
		t7 = new JTextField();
		t7.setBackground(Color.WHITE);
		t7.setDisabledTextColor(Color.BLACK);
		t7.setEditable(false);
		t7.setColumns(10);
		t7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t7.setBounds(487, 103, 219, 30);
		panel.add(t7);
		
		JLabel lblroom = new JLabel("Issue Date");
		lblroom.setBounds(367, 105, 110, 27);
		panel.add(lblroom);
		
		t8 = new JTextField();
		t8.setBackground(Color.WHITE);
		t8.setDisabledTextColor(Color.BLACK);
		t8.setEditable(false);
		t8.setColumns(10);
		t8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t8.setBounds(487, 154, 219, 30);
		panel.add(t8);
		
		JLabel lblBeds = new JLabel("Return Date");
		lblBeds.setBounds(367, 156, 110, 27);
		panel.add(lblBeds);
		
		t6 = new JTextField();
		t6.setBackground(Color.WHITE);
		t6.setDisabledTextColor(Color.BLACK);
		t6.setEditable(false);
		t6.setColumns(10);
		t6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t6.setBounds(130, 343, 219, 30);
		panel.add(t6);
		
		JLabel lblmbl = new JLabel("Book Name");
		lblmbl.setBounds(10, 345, 110, 27);
		panel.add(lblmbl);
		
		t9 = new JTextField();
		t9.setBackground(Color.WHITE);
		t9.setDisabledTextColor(Color.BLACK);
		t9.setEditable(false);
		t9.setColumns(10);
		t9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t9.setBounds(487, 205, 219, 30);
		panel.add(t9);
		
		JLabel lblHomeAddress = new JLabel("Returned?");
		lblHomeAddress.setBounds(367, 207, 110, 27);
		panel.add(lblHomeAddress);
		
		b1 = new JButton("Delete");
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
		panel.add(btnback);
		btnback.addActionListener(this);
		
		btnsearch = new JButton("Search");
		btnsearch.setFocusable(false);
		btnsearch.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnsearch.setBackground(Color.ORANGE);
		btnsearch.setBounds(260, 85, 89, 30);
		btnsearch.addActionListener(this);
		panel.add(btnsearch);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(e.getSource()==btnback) {
					Menu mu=new Menu();
					mu.menu1();
					frame.setVisible(false);
					mu.frame.setVisible(true);
				}
				else if(e.getSource()==btnsearch){
					try {
						Connection conc=CP.createC();
						String q="select * from student where id = ?";
						PreparedStatement pst=conc.prepareStatement(q);
						
						pst.setString(1, t1.getText());
						ResultSet rs=pst.executeQuery();
						while(rs.next())
						{
							t2.setText(rs.getString(1));
							t3.setText(rs.getString(2));
							t4.setText(rs.getString(4));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t8.setText(rs.getString(8));
							t9.setText(rs.getString(9));
						}
						
						}
						catch(Exception ex) {
							JOptionPane.showMessageDialog(null, "Error!");
						}
						}
				else {
					boolean f=false;
					try{
						Connection conc=CP.createC();
						String q="delete from student where id=?";
						PreparedStatement ptmt=conc.prepareStatement(q);
						ptmt.setString(1,t1.getText());
						ptmt.executeUpdate();
						f=true;
						}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Error!");
					}
					if(f==true) {
						JOptionPane.showMessageDialog(null, "Record Deleted!");
						t1.setText("");
						t2.setText("");
						t4.setText("");
						t5.setText("");
						t6.setText("");
						t7.setText("");
						t8.setText("");
						t9.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "Error! Record Not Deleted");
					}
				}
				
				}

}
