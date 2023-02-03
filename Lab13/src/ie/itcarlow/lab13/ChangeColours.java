package ie.itcarlow.lab13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColours extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] colours = {"red", "blue" ,"green"};

	private JComboBox chooseColours;
	private JCheckBox box1; 
	private JCheckBox box2;
	private JButton ok;
	private JButton cancel;
	private JPanel	uPanel;
	private JPanel	panel1;
	private JPanel	panel2;
	private JPanel	panel3;
	
	public ChangeColours(String title) {
		
		super(title);
		
		chooseColours = new JComboBox(colours);
		chooseColours.setPreferredSize(new Dimension(300,20));
		panel1 = new JPanel(new FlowLayout());
		panel1.add(chooseColours);
		
		box1 = new JCheckBox("Background");
		box2 = new JCheckBox("Foreground");
		panel2= new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(box1);
		panel2.add(box2);
		
		ok = new JButton("OK");
		cancel = new JButton("Cancel");
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(cancel);
		panel3.add(ok);
		
		uPanel = new JPanel(new GridLayout(3,1,10,0));
		uPanel.add(panel1);
		uPanel.add(panel2);
		uPanel.add(panel3);
		
		add(uPanel);
	}
	
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
}
