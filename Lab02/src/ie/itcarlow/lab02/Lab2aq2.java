package ie.itcarlow.lab02;

public class Lab2aq2 {

	public static void main(String[] args) {
		HotelRooms roomA = new HotelRooms(0, 100.00);
		HotelRooms roomB = new HotelRooms( 1, 80.00);
		
		System.out.println("status: 		" + roomA.getRoomState());
		System.out.println("Rate: 			" + roomA.getRoomRate());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("status: 		" + roomB.getRoomState());
		System.out.println("Rate: 			" + roomB.getRoomRate());
		
		
		

	}

}
