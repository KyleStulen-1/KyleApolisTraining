package oops_08_association;

//association: can refer to default variables in the same file or package without accessor methods 

class College {
	String collegeName;
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}


public class Student {
	public static void main(String[] args) {
		College compsci = new College();
		compsci.setCollegeName("Computer Science");
		System.out.println(compsci.collegeName);
	}
	
}
