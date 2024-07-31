package java0731_1;

public class Student extends Person {
	
	public String name;
	public int studentNo;

	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

	public void study() {
		System.out.println("공부");
	}
}
