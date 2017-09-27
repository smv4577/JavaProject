import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EvenBetterUI extends JFrame {
	private JButton b1;
	private JButton b2;
	private JTextField tf;
	
	public EvenBetterUI() {
		setTitle("Even Better User Interface");
		setSize(400, 500);
		
		ButtonEventHandler beh = new ButtonEventHandler();

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		b1 = new JButton("Add");
		b1.addActionListener(beh);
		c.add(b1);

		b2 = new JButton("Sub");
		b2.addActionListener(beh);
		c.add(b2);

		tf = new JTextField(5);
		tf.setText("0");
		c.add(tf);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EvenBetterUI();
	}
	
	private class ButtonEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String cs = tf.getText();	// Gets current string from JTextField tf
			
			String command = ae.getActionCommand();	// Gets label on button that was clicked
			
			int currentValue = Integer.parseInt(cs, 10);
			
			if (command.equals("Add")) {
				currentValue += 1;
			}
			else if (command.equals("Sub")) {
				currentValue -= 1;
			}
			
			String ns = Integer.toString(currentValue);
			
			tf.setText(ns);
		}
	}
}
