package oops_11_overloading_constructors;

public class ClassRoom {
	
	private String className;
	private int classSize; 
	private String teacherName;

	public ClassRoom(String className, int classSize, String teacherName) {
		this.className = className;
		this.classSize = classSize; 
		this.teacherName = teacherName;
	}
	
	public ClassRoom(String className, int classSize) {
		this.className = className;
		this.classSize = classSize; 
	}
	
	public ClassRoom(String className) {
		this.className = className;
	}
	
	public ClassRoom() {}
	
}
