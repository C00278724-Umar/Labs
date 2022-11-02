package ie.itcarlow.lab04;

public class Office{
	
	private String office;

	
	
	
	public Office() {
		
	}
	
	public String setDublin() {
		
		office = "Dublin";
		return office;
	
		
	}

	public String setCarlow() {
		
		office = "Carlow";
		return office;
	
		
	}
	

	public String setNewBridge() {
		
		office = "Newbridge";
		return office;
	
		
	}
	
	public String getDublin(Adress add, Employee emp,String office) {
		
		if(office == setDublin()) {
			return "[" + emp + "]" + "[" + add + "]" + "[" + office + "]"; 
		}
		else {
			return "false";
		}
	}
	
	public String getCarlow(Employee emp,Adress add ,String office) {
		
		if(office == setCarlow()) {
			return "[" + emp + "]" + "[" + add + "]" + "[" + office + "]"; 
		}
		else {
			return "false";
		}
	}
	
	public  String getNewbridge(Adress add, Employee emp,String office) {
		
		if(office == "Newbridge") {
			return "[" + emp + "]" + "[" + add + "]" + "[" + office + "]"; 
		}
		else {
			return "false";
		}
	}
	
	
	
	
	public String toString() {
		return "Office [" + office +" ]";
	}
}