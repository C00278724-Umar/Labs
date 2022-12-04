package ie.itcarlow.lab08;

public class Circle extends ThreeDShape{
	
	protected double radius;

	public Circle(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
	}

	
	
	@Override
	public double area() {
		return 0;
	}



	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


	

	
}
