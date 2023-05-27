import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class ShowAll {                        // Display All Student Class
	
	JFrame frame;
	JTable table;
	
	public void showalldata() {
		frame = new JFrame("LIBRARY MANAGEMENT APP");          // Display All Student Frame
		frame.setBounds(100, 100, 787, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setBounds(0, 0, 771, 265);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton b1 = new JButton("Back");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m=new Menu();
				m.menu1();
				m.frame.setVisible(true);
				frame.setVisible(false);	
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.setFocusable(false);
		b1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		b1.setBackground(Color.ORANGE);
		b1.setBounds(240, 289, 99, 40);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Show");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Connection conc=CP.createC();
					Statement st=conc.createStatement();
					String q="select * from student";
					ResultSet rs=st.executeQuery(q);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int cols = rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++) { 
						colName[i]=rsmd.getColumnName(i+1);}
					model.setColumnIdentifiers(colName);
					String fun,fna,i,se,p,fp,rn,be,ad;
					while(rs.next()) {
						fun=rs.getString(1);
						fna=rs.getString(2);
						i=rs.getString(3);
						se=rs.getString(4);
						p=rs.getString(5);
						fp=rs.getString(6);
						rn=rs.getString(7);
						be=rs.getString(8);
						ad=rs.getString(9);
						String[] row= {fun,fna,i,se,p,fp,rn,be,ad};
						model.addRow(row);	
					}
					st.close();
					conc.close();
					}
					catch(Exception ex)
					{
					JOptionPane.showMessageDialog(null, "Error!");	
		             }
	}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.setFocusable(false);
		b2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		b2.setBackground(Color.ORANGE);
		b2.setBounds(436, 289, 99, 40);
		frame.getContentPane().add(b2);
	}

}
