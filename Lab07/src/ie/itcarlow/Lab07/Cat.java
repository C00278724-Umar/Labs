package ie.itcarlow.Lab07;

public class Cat extends Animal {
	
	public Cat(String name, int age, char gender) {
		super(name,age,gender);
	}
	
	public void eat() {
		System.out.println("Cat is eating");
		
	}
	
	public void sleep() {
		System.out.println("Cat is sleeping");
		
	}
	
	public void makeSound() {
		System.out.println("meow");
		
	}
	
	public String toString() {
		return "Cat [" + getName() + ", " + getAge() + ", " + getGender()
				+ ", " + super.toString() + ", " + getClass() 
				+ "]";
	}
}
