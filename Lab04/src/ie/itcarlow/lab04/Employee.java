package ie.itcarlow.lab04;

public class Employee {
	private static int 	employeeNum = 1000;
	private int num;
	private String 	eName;
	private	int		age;
	private String 	rank = "Staff";
	private static int reg2 = 123;
	private String car = "Mercedes";
	private String reg = "12 AX";
	private int reg3 = 0;
	
	public Employee(String name, int eAge) {
		
		employeeNum++;
		num = employeeNum;
		seteName(name);
		setAge(eAge);
		
	}

	public static int getEmployeeNum() {
		return employeeNum;
	}

	

	
	private void seteName(String eName) {
		this.eName = eName;
	}

	

	private void setAge(int age) {
		this.age = age;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		if(rank == "Manager") {
			
			return "Employee [Name=" + eName + " Employee number = " + num + ", age=" + age + ", type=" + rank + "]" + "[ Car" + car + " Reg = " + reg + " " + reg3;
			
		}
		else {
			
		return "Employee [Name=" + eName + " Employee number = " + num + ", age=" + age + ", type=" + rank + "]";
		
		}
	
	}

	public void setManager() {
		rank = "Manager";
	}
	public void setCar() {

		reg2 ++;
		
		reg3 = reg2;
		}
	
	
	

}
