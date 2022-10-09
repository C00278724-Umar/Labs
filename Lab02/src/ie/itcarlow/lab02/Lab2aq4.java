package ie.itcarlow.lab02;

public class Lab2aq4 {

	public static void main(String[] args) {
		
		HotelRooms roomA = new HotelRooms();
		HotelRooms roomB = new HotelRooms();
		
		roomA.setRoomState(0);
		roomB.setRoomState(1);
		roomA.setRoomType("Single");
		roomB.setRoomType("double");
		
		roomB.setOccupied();
		
		System.out.println(roomA.isOccupied());
		System.out.println(roomB.isOccupied());
		
		
	}

}
