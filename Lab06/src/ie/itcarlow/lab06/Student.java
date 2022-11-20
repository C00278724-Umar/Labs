package ie.itcarlow.lab06;

public class Student extends Person{

	private int numCourses = 0;
	private String courses[];
	private int[] grades;
	
	
	
	public Student(String name, String address) {
		super(name, address);
		
		courses = new String[2];
		grades = new int[courses.length];
		
	}
	
	
	public String toString() {
		return super.toString();
	}
	
	public void addCourseGrade(String course, int grade) {
		if(numCourses < courses.length) {
			courses[numCourses] = course;
			grades[numCourses] = grade;
		}
		numCourses++;
	}
	
	public void printGrades() {
		System.out.println(super.toString());
		for(numCourses = 0; numCourses < courses.length; numCourses++) {
			System.out.println(courses[numCourses]);
			System.out.println(grades[numCourses]);
			
		}
	}
	
	public double getAverageGrade() {
		
		int totalGrades = 0;
		
		for(numCourses = 0; numCourses < courses.length; numCourses++) {
			totalGrades =totalGrades + grades[numCourses]; 
			
		}
		
		totalGrades = totalGrades/numCourses;
		return totalGrades;
		
	}

}
