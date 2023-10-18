package oops_19_cloning;
/**
 * Deep cloning
 * @author Heeren
 * @version 1.0
 */
class School1 implements Cloneable {
	String schoolName;
	String directorName;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", directorName=" + directorName + "]";
	}

}

class Student3 implements Cloneable {
	String sName;
	int rollNo;
	School1 school;

	public Student3(String sName, int rollNo, School1 school) {
		super();
		this.sName = sName;
		this.rollNo = rollNo;
		this.school = school;
	}

	public Object clone() throws CloneNotSupportedException {
		//create new student and return it
		Student3 student = (Student3) super.clone();
		School1 school = (School1) this.school.clone();
		student.school = school;
		return student;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", rollNo=" + rollNo + ", school=" + school + "]";
	}
}

public class CloneableStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		School1 school = new School1(); // 1000
		school.schoolName = "DAV School"; // 1000
		Student3 stu1 = new Student3("Tom", 45, school);
		Student3 stu2 = (Student3) stu1.clone();
		System.out.println(stu1);
		System.out.println(stu2);

		stu1.school.schoolName = "DPS";
		System.out.println("-------------------------------------------------------------");
		System.out.println(stu1);
		System.out.println(stu2);

	}
}