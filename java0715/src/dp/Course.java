package dp;

import java.util.Vector;

public class Course {
	private String id;
	private String name;
	private int numOfStudents = 0;
	private Vector<Student> students;
	
	
	
	public Course(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.students = new Vector<Student>();
	}
	

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", numOfStudents=" + numOfStudents + ", students=" + students
				+ "]";
	}



	public void addStudent(Student student) {
		students.add(student);
	}
	public void deleteStudent(Student student) {
		if (students.contains(student))
			students.remove(student);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public int getNumOfStudents() {
		return numOfStudents;
	}


	public Vector<Student> getStudents() {
		return students;
	}
	
	

}
