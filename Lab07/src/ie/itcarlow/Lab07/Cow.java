package ie.itcarlow.Lab07;

public class Cow extends Animal {
	
	public Cow(String name, int age, char gender) {
		super(name,age,gender);
	}
	
	public void eat() {
		System.out.println("Cow is eating");
	
	}
	
	public void sleep() {
		System.out.println("cow is sleeping");
	
	}
	
	public void makeSound() {
		System.out.println("moo");
	
	}
	
	public String toString() {
		return "Cow [" + getName() + ", " + getAge() + ", " + getGender()
				+ ", " + super.toString() + ", " + getClass() 
				+ "]";
	}

}
