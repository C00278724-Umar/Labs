package ie.itcarlow.lab06;

public class Teacher extends Person {
	
	private int numCourses = 0;
	private String[] courses;
	
	

	public Teacher(String name, String address) {
		super(name, address);
		courses = new String[2];
	
	}
	
	public String toString() {
		return super.toString();
	}
	
	public boolean addCourse(String course) {
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	public boolean removeCourse(String course) {
		numCourses = 0;
		courses[numCourses] = "removed";
		numCourses++;
		return true;
	}

}
