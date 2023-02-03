package ie.itcarlow.lab12;

import javax.swing.JFrame;

public class AlignDriver {
	
	public static void main(String[] args) {
		
		Align content = new Align("Align");
		content.setSize(400, 200);
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content.setLocation(400,400);
		content.setVisible(true);
	}

}
