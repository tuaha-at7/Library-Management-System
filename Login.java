import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

public class Login implements ActionListener {             // Login Class
	
	JFrame frame;
	JTextField t1;
	JPasswordField pass;
	JButton btn;
	
	void login1() {
		
		frame = new JFrame("Library Management System");         // Login Frame
		frame.setBounds(100, 100, 396, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 209, 204));
		panel.setBounds(0, 0, 380, 96);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 380, 96);
		panel.add(lblNewLabel);
		
		JLabel admin = new JLabel("ADMIN LOGIN");
		admin.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		admin.setBounds(140, 70, 213, 15);
		panel.add(admin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 196));
		panel_1.setBounds(0, 97, 380, 306);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("User Name");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl1.setBounds(33, 66, 83, 38);
		panel_1.add(lbl1);
		
		t1 = new JTextField();
		t1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		t1.setFont(new Font("Tahoma", Font.BOLD, 13));
		t1.setBounds(136, 66, 213, 41);
		panel_1.add(t1);
		t1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(33, 143, 83, 38);
		panel_1.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pass.setBounds(136, 141, 213, 41);
		pass.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(pass);
		
		btn = new JButton("Login");
		btn.setBackground(new Color(72, 209, 204));
		btn.setFocusable(false);
		btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btn.setBounds(136, 225, 117, 38);
		panel_1.add(btn);
		btn.addActionListener(this);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn) {
			String s1=t1.getText();
			String s2=pass.getText();
			
		if(s1.equals("1") && s2.equals("1")) {
			
			frame.setVisible(false);
			Menu m=new Menu();
			m.menu1();
			Menu mu=new Menu();
			mu.menu1();
			frame.setVisible(false);
			mu.frame.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect UserName Or Password!");
		}
		
	}
  }
}
