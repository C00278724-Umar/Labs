package ie.itcarlow.lab04;

public class Adress {
	
	 int hNum;
	 private String street;
	 private String	state;
	 private String town;
	 private String eirCode;
	
	public Adress(int hNum, String street, String state,String town, String eirCode) {
		
		sethNum(hNum);
		setStreet(street);
		setState(state);
		setEirCode(eirCode);
		setTown(town);
		
	}

	private void setTown(String town2) {
		this.town = town2;
		
	}
	
		
	

	
	private void sethNum(int hNum) {
		this.hNum = hNum;
	}

	

	private void setStreet(String street) {
		this.street = street;
	}

	

	private void setState(String state) {
		this.state = state;
	}

	

	private void setEirCode(String eirCode) {
		this.eirCode = eirCode;
	}

	@Override
	public String toString() {
		return "Adress [ " + hNum + ", " + street + ", " + state + ", " + town + ", "
				+ eirCode + "]";
	}
	
	
	

}
