package java0718;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		if (parent instanceof Child) {
			System.out.println("타입 변환 가능");
			Child child = (Child) parent;
		} else {
			System.out.println("타입 변환 불가능");
		}

	}
}
