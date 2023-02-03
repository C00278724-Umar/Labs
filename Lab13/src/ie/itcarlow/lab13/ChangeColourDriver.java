package ie.itcarlow.lab13;

import javax.swing.JFrame;

public class ChangeColourDriver {
	
	public static void main(String[] args) {
	
		ChangeColours colour = new ChangeColours("Choose Colour");
		colour.setSize(400, 200);
		colour.setLocation(400, 400);
		colour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colour.setVisible(true);
	
	}

}
