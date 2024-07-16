package java0716;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point {

	int x, y;
	
	public Point() {
		
	}
	
	void method() {
		System.out.println(x + ", " + y);
	}
	
}
