package ie.itcarlow.Lab07;

public class AnimalTest {

	public static void main(String[] args) {
		
		Vet vaccine = new Vet();
		
		
		Animal dog = new Dog("Poodle", 4, 'M');
		
		dog.eat();
		dog.sleep();
		dog.makeSound();
		vaccine.vaccinate(dog);
		
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		
		cat.eat();
		cat.sleep();
		cat.makeSound();
		vaccine.vaccinate(cat);
		System.out.println();

		Animal cow = new Cow("Daisy", 3, 'F');
		cow.eat();
		cow.sleep();
		cow.makeSound();
		vaccine.vaccinate(cow);


	}

}
