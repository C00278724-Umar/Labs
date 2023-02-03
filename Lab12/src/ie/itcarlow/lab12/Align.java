package ie.itcarlow.lab12;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Align extends JFrame{
	
	private JTextField 		x = new JTextField("X :");
	private JTextField  	y = new JTextField("Y :");
	private JButton			cancel = new JButton("cancel");
	private JButton 		ok = new JButton("OK");
	private JButton 		help = new JButton("Help");
	private JCheckBox 		box1 = new JCheckBox("Snap to Grid");
	private JCheckBox 		box2 = new JCheckBox("Show Grid");

	public Align(String title) {
		super(title);
		setLayout(null);
		
		box1.setBounds(0,40,150,50);
		add(box1);
		
		box2.setBounds(0, 80, 150, 50);
		add(box2);
		
		
		add(x);
		x.setBounds(175,40,75,25);
		
		
		y.setBounds(175,90,75,25);
		add(y);
		
		
		add(ok);
		ok.setBounds(300, 30, 75, 25);
		
		add(cancel);
		cancel.setBounds(300,70,75,25);
		
		add(help);
		help.setBounds(300,110,75,25);
	}
	
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
	
	
}
