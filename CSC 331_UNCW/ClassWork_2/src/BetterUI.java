import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BetterUI extends JFrame {
	private JButton b1;
	private JButton b2;
	private JTextField tf;
	
	public BetterUI() {
		setTitle("Better User Interface");
		setSize(400, 500);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
			
		b1 = new JButton("Add");
		c.add(b1);
		
		b2 = new JButton("Sub");
		c.add(b2);
		
		tf = new JTextField(5);
		tf.setText("0");
		c.add(tf);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BetterUI();
	}
}
