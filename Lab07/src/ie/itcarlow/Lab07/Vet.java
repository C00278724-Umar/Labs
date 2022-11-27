package ie.itcarlow.Lab07;

public class Vet {
	
	public Vet() {
		
	}
	
	public void vaccinate(Animal subject) {
		System.out.println(subject.getName() + " is vaccinating");
		
		if(subject instanceof Dog) {
			
			System.out.println(((Dog)subject).getName()+" has been vaccinated");
			System.out.println(((Dog)subject).toString());
		}
		else if(subject instanceof Cat) {
			
			System.out.println(((Cat)subject).getName() + " has been vaccinated");
			System.out.println(((Cat)subject).toString());
			
		}
		else if(subject instanceof Cow) {
			System.out.println("Cow has been vaccinated");
			System.out.println(((Cow)subject).toString());
		}
	}
	

}
