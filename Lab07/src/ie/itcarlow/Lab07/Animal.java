 package ie.itcarlow.Lab07;

public class Animal {
	
	private String 	name;
	private int		age;
	private char 	gender;
	
	public Animal(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	public void makeSound() {
		System.out.println("A generic animal sound");	
	}
	
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
