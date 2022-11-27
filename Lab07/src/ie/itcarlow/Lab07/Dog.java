package ie.itcarlow.Lab07;

public class Dog extends Animal {
	
	

	public Dog(String name, int age, char gender) {
		
		super(name, age, gender);
		
	}
	
	public void eat() {
		System.out.println("Dos is eating");
		
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
		
	}
	
	public void makeSound() {
		System.out.println("woof woof");
		
	}
	public String toString() {
		return "Dog [" + getName() + ", " + getAge() + ", " + getGender()
				+ ", " + super.toString() + ", " + getClass() 
				+ "]";
	}

}
