package oops_04_instance_methods;

public class Student {
	
	private static enum Grade {A, B, C, D, F}; 
	
	private String name;
	private Grade grade;
	
	public Student(String name, Grade grade){
		this.name = name;
		this.grade = grade;
	}
	
	private void displayInformation() {
		System.out.println("name: " + name + ", grade: " + grade);
	}
	
	public String toString() {
		return "name: " + name + ", grade: " + grade;
	}
	
	
	public static void main(String[] args) {
		Student student1 = new Student("Jack", Grade.A);
		
		System.out.println(student1.toString());
		
		student1.displayInformation();
	}
	

}
