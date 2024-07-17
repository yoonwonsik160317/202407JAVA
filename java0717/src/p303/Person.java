package p303;

public class Person {
	String nation = "Korea";
	static final double PI = 3.141592;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.nation = "USA";
		System.out.println(p1.nation);
	}
}
