package ie.itcarlow.Lab02B;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private int 	index;	
	private int 	index2;
		public Rectangle() {
			setLength(1.0);
			setWidth(1.0);
		}

		public void setLength(double l) {
			if((l > 0.0) && (l <=40.0)) {
				length=l;
			}
			if(l>40.0) {
				System.out.println("Length can't be greater than 40.0");
				System.out.println("setting length to default");
			}
			else {
				System.out.println("length can't be 0.0");
				System.out.println("setting length to default");
			}
			
		}

		public void setWidth(double w) {
			if((w > 0.0) && (w <= 40.0)) {

				width = w;
			}
			if(w>40.0) {
				System.out.println("Width can't be greater than 40.0");
				System.out.println("setting width to default");
			}
			else {
				System.out.println("width can't be zero");
				System.out.println("setting width to default");
			}
		
			}
		public double getArea() {
			
			area = (length * width);
			return area;
			
		}
		public double getPerimeter() {
			perimeter = 2*(length + width);
			return perimeter;
		}
		
		public double getLength() {
			return length;
		}
		
		public double getWidth() {
			return width;
		}
		public String toString() {
			
			return " Length = " + length + " Width = " + width;
			
		}
		public void printRectangle() {							//This loop will setup top side length of rectangle.
			for(index = 1; index<= length; index++) {
				System.out.print("*");
				}
			
			
			System.out.println();		//It is been used here to break line and start the other process from next line
			
			
			for(index=1; index<= width; index++) {			//This loop will start printing the width of rectangle
				System.out.print("*");
				for(index2 = 1; index2<length; index2 ++) {		// I have to keep both sides of rectangle width parallel thatswhy i used this loop to create the required space between both sides
					System.out.print(" ");
				}
				System.out.print("*");			// First loop continues and create both sides of width parallel at one time.
				System.out.println();

			
			}
			
			
			for(index = 1; index<= length; index++) {  //finally the bottom side length of rectangle
				System.out.print("*");
				}
			
			
			
		}
	}


