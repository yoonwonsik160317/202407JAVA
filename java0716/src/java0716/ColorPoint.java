package java0716;


public class ColorPoint extends Point{
	
	public ColorPoint() {
		super(100, 200);
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}

	@Override
	void method() {
		System.out.println("자식이 오버라이딩!");
		super.method();
	}
	
}
