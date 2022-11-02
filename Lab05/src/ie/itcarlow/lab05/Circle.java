package ie.itcarlow.lab05;

public class Circle extends Point{
	
	private int radius;
	
	public Circle(int x, int y, int r) {
		
		super(x, y);
		setRadius(r);
		
	}
	

	public int getRadius() {
		return radius;
	}

	

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	

}
