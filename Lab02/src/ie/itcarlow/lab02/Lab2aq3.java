package ie.itcarlow.lab02;

public class Lab2aq3 {

	public static void main(String[] args) {
		
		
			
			HotelRooms roomA = new HotelRooms(200,"single", 0, 100.00);
			HotelRooms roomB = new HotelRooms(201, "double", 1, 80.00);
			HotelRooms roomC = new HotelRooms(202,"single", 0, 100.00);
			
			System.out.println("Room number: 	" + roomA.getRoomNumber());
			System.out.println("Room Type: 		" + roomA.getRoomType());
			System.out.println("status: 		" + roomA.getRoomState());
			System.out.println("Rate: 			" + roomA.getRoomRate());
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			System.out.println("Room number: 	" + roomB.getRoomNumber());
			System.out.println("Room Type: 		" + roomB.getRoomType());
			System.out.println("status: 		" + roomB.getRoomState());
			System.out.println("Rate: 			" + roomB.getRoomRate());
			

			System.out.println();
			System.out.println();
			System.out.println();
			
			
			System.out.println("Room number: 	" + roomC.getRoomNumber());
			System.out.println("Room Type: 		" + roomC.getRoomType());
			System.out.println("status: 		" + roomC.getRoomState());
			System.out.println("Rate: 			" + roomC.getRoomRate());
			
			
			

	}

}
