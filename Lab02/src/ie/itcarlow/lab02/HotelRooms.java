package ie.itcarlow.lab02;

public class HotelRooms {
	private int roomNumber;
	private String roomType;
	private int 	state;
	private double	rate;

	
	
	public HotelRooms() {//constructor 01 Q1
		
		
		
	}
	
	
	
	public HotelRooms(int occupied,double rate) {//constructor 02 Q2
		
		setRoomState(occupied);
		setRoomRate(rate);
		
	}
	
	
public HotelRooms(int number, String type,int occupied,double rate) {//constructor 03 Q3 
		
		setRoomNumber(number);
		setRoomType(type);
		setRoomState(occupied);
		setRoomRate(rate);
	}
	
	public void setRoomRate(double roomRate) {
	
		rate = roomRate; 
}


	public void setRoomState(int number1) {
		state = number1;
	}
	public void setRoomNumber(int number2) {
		roomNumber = number2;
		
	}
	public HotelRooms(String type) {
		setRoomType(type);
	}
	
	public void setRoomType(String type) {
		roomType = type;
		
	}
	public int getRoomNumber() {
		return roomNumber;
		
	}
	public int getRoomState(){
		return state;
	}
	public String getRoomType() {
		return roomType;
	}
	
	public double getRoomRate() {
		return rate;
	}
	
	public boolean isOccupied() {
		if (state == 1) {
			return false;
		}
		else {
		return true;
		}
	}
	
	public void setOccupied(){
		if(state == 1) {
			setRoomState(0);
		}
		else {
		System.out.println("This room is already occupied");
		}
	}
	
	}
	
		
	
	

