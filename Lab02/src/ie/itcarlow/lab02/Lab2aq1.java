package ie.itcarlow.lab02;

public class Lab2aq1 {
	public static void main(String args[]) {
		
		HotelRooms roomA = new HotelRooms();
		HotelRooms roomB = new HotelRooms();
		
		roomA.setRoomNumber(200);
		roomB.setRoomNumber(201);
		roomA.setRoomType("Single");
		roomB.setRoomType("double");
		
		
		System.out.println("Room number " + roomA.getRoomNumber() + " (" + roomA.getRoomType() + ")");
		System.out.println("Room number " + roomB.getRoomNumber() + " (" + roomB.getRoomType() + ")");
	}

}
