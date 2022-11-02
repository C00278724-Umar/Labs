package ie.itcarlow.lab04;
import java.util.Scanner;

public class MyHr2 {

	public static void main(String[] args) {
		
		int option = 0;
		int index = 0;
		int noOfEmployees =0;
		Employee empArray[] ;
		Adress	 addArray[];
		Office offArray[];
		String[]	officeArray;
		
		empArray = new Employee[5];
		addArray = new Adress[5];
		offArray = new Office[5];
		officeArray  = new String[5];
		
		while (option != 4) {
			
			System.out.println("choose number");
			System.out.println("1.		List all offices");
			System.out.println("2.		Create new employee");
			System.out.println("3.		List all employees");
			System.out.println("4.  	exit");
			
			Scanner input = new Scanner(System.in);
			
			option = input.nextInt();
			
			if(option == 1) {
				
				System.out.println();
				System.out.println();
				System.out.println("1.		Dublin Office");
				System.out.println("2. 		Carlow Office");
				System.out.println("3.		Newbridge Office");
				System.out.println();
				System.out.println();
				
			}//if 01 ends
			
			if(option == 2) {
				
				System.out.println ("How many employees you want to create?");
				noOfEmployees = input.nextInt();
				if(noOfEmployees <= empArray.length) {
				
				Scanner input2 = new Scanner(System.in);
				
				for(index = 0; index < noOfEmployees ; index ++) {
					//populating employees array
					System.out.println("Enter Name");
					String name = input2.nextLine();
					System.out.println("Enter Age");
					int age = input.nextInt();
					
					//populating address array
					System.out.println("Enter Address Line 01 (house no)");
					int hNo = input.nextInt();
					System.out.println("Enter Address Line 02 (street name)");
					String st = input2.nextLine();
					System.out.println("Enter Address Line 03 (state)");
					String state = input2.nextLine();
					System.out.println("Enter Address Line 04 (city/town)");
					String town = input2.nextLine();
					System.out.println("Enter eir-code");
					String eirCode = input2.nextLine();
					//creating instances
					empArray[index] = new Employee(name,age);
					addArray[index] = new Adress(hNo,st,state,town,eirCode);
					offArray[index] = new Office();
					
					Scanner input3 = new Scanner(System.in);
					
					//Clling a method to set employee as manager in employee array
					System.out.println("Is employee a manager");
					char manager = input3.next().charAt(0);
					
					if(manager == 'y') {
						
						empArray[index].setManager();
						empArray[index].setCar(); // A method which will set up a car for manager
						
					}
					// Methods which will assign office to employees 
					System.out.println("What office you want to assign to the employee");
					int office = input.nextInt();
					
					int count1 = 0;// this variable will keep track of how many employees are assigned in one office
					if(office == 1 && count1 <=2) {// condition making sure no office get more than two employees
						
						officeArray[index]= offArray[index].setDublin();
						count1++;
						
					}
					
					
					int count2 = 0;
					if(office == 2 && count2 <= 2) {
						
						officeArray[index] = offArray[index].setCarlow();
						count2++;
					}
					
					
					
					int count3 = 0;
					if(office == 3 && count3 <= 2) {
						
						officeArray[index] = offArray[index].setNewBridge();
						count3++;
					}
					//if condition false
					else if(count1 > 2 || count2 > 2 || count3 > 2) {
						System.out.println("You can not assign one office to more than 2 employees");
					}
					
				
					
				}//for loop ends
				
				
			
				index = 0;
				for(index = 0; index < noOfEmployees; index ++) {
					
					System.out.println(empArray[index].toString() + " " + addArray[index].toString() + " " + officeArray[index]);
					
				}//for ends
				
				
				
			}//condition if noOfEmployees <= empArray.length ends
				
				else {
					System.out.println("you cannot add more then 5 employees");
				}
			
			
		}//if 2 ends
			
					//printing all the employees in each office
					if(option == 3) {
						
						System.out.println();
						System.out.println("To get all the employees in an office press the office number");
						
						int offNum = input.nextInt();
						index = 0;
						for(index = 0; index < noOfEmployees; index++){
						
							if(offNum == 1) {
							
								System.out.println(offArray[index].getDublin(addArray[index], empArray[index], officeArray[index]));
							
							}
						
							else if(offNum == 2) {
							
								System.out.println(offArray[index].getCarlow(empArray[index], addArray[index], officeArray[index]));
							
							}
						
							else if(offNum == 3) {
							
								System.out.println(offArray[index].getNewbridge(addArray[index], empArray[index], officeArray[index]));
							
							}
							else {
								System.out.println("no record found");
							}
						}	
						
						
					}//if ends
			
		}//while ends

	}//main end

}//class end
