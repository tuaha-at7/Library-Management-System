import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Intro {                        // Introduction Class
	
	private JFrame frame;
	private final JPanel panel = new JPanel();
	static JProgressBar bar;

	public void intro1(){
	
	frame = new JFrame("Library Management System");    //  Introduction Frame
	frame.setBounds(100, 100, 497, 281);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	panel.setBackground(new Color(72, 209, 204));
	panel.setBounds(0, 0, 481, 242);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lbl1 = new JLabel("AIR UNIVERSITY");
	lbl1.setForeground(new Color(0, 0, 0));
	lbl1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 23));
	lbl1.setHorizontalAlignment(SwingConstants.CENTER);
	lbl1.setBounds(0, 11, 481, 45);
	panel.add(lbl1);
	
	JLabel lbl2 = new JLabel("Made by Tuaha and Shamir");
	lbl2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
	lbl2.setHorizontalAlignment(SwingConstants.CENTER);
	lbl2.setBounds(0, 44, 481, 27);
	panel.add(lbl2);
	
	bar=new JProgressBar();                 // Main Progress Bar
	bar.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
	bar.setValue(0);
	bar.setStringPainted(true);
	bar.setAlignmentX(Component.RIGHT_ALIGNMENT);
	bar.setBackground(Color.WHITE);
	bar.setBounds(63, 191, 364, 28);
	bar.setForeground(new Color(50, 205, 50));
	panel.add(bar);
	
	frame.setVisible(true);
	bar1();
	frame.setVisible(false);
}	
static void bar1() {
	// TODO Auto-generated method stub4
	int counter=0;
	while(counter<=100) {
		bar.setValue(counter);
		try {
			Thread.sleep(20);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	counter++;
	}
  }	
}
