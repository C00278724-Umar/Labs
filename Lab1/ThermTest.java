package ie.itcarlow.lab01;

public class ThermTest {

	public static void main(String[] args){
	
	{ // being main method

		double tempB;
		
		
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0);
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
	
		tempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer A is " + tempB );
	}
	}
}
