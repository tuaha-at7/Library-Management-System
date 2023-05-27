import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Menu {          // Menu Class ( For Selection )
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6;
	JPanel panel_11,panel_1;
	
	public void menu1() {
		
		frame = new JFrame("LIBRARY MANAGEMENT APP");
		frame.setBounds(100, 100, 797, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Hanzalah\\Downloads\\Gettyimages.jpg");
	        JLabel backgroundLabel = new JLabel(backgroundImage);

	      
	        backgroundLabel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
	        frame.add(backgroundLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 780, 430);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		lblNewLabel.setBounds(160, 50, 500, 31);
		panel.add(lblNewLabel);
		
		JButton btn1 = new JButton("Issue Book ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent as=new AddStudent();
				as.add();
				frame.setVisible(false);
				as.frame.setVisible(true);	
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.setFocusable(false);
		btn1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		btn1.setBackground(Color.ORANGE);
		btn1.setBounds(173, 146, 104, 39);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Delete Record");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeleteStudent ds=new DeleteStudent();
				ds.deletest1();
				frame.setVisible(false);
				ds.frame.setVisible(true);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn2.setFocusable(false);
		btn2.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		btn2.setBackground(Color.ORANGE);
		btn2.setBounds(334, 146, 104, 39);
		panel.add(btn2);
		
		JButton btn3 = new JButton("Search Record");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ShowStudent ss=new ShowStudent();
				ss.showstudent1();
				frame.setVisible(false);
				ss.frame.setVisible(true);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn3.setFocusable(false);
		btn3.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		btn3.setBackground(Color.ORANGE);
		btn3.setBounds(509, 146, 104, 39);
		panel.add(btn3);
		
		JButton btn4 = new JButton("Update Record");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateStudent up=new UpdateStudent();
				up.update1();
				frame.setVisible(false);
				up.frame.setVisible(true);	
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn4.setFocusable(false);
		btn4.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		btn4.setBackground(Color.ORANGE);
		btn4.setBounds(173, 252, 104, 39);
		panel.add(btn4);
		
		JButton btn5 = new JButton("Display Record");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowAll sd=new ShowAll();
				sd.showalldata();
				sd.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn5.setFocusable(false);
		btn5.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		btn5.setBackground(Color.ORANGE);
		btn5.setBounds(334, 252, 104, 39);
		panel.add(btn5);
		
		JButton btn6 = new JButton("Exit");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn6.setFocusable(false);
		btn6.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		btn6.setBackground(Color.ORANGE);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		btn6.setBounds(617, 351, 104, 39);
		panel.add(btn6);
	}
}
