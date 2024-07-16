package java0716;

public class Calculator {
	int x,  y;

	int plus() {
		return x + y;
	}
	
	double avg() {
		return plus()/2.0;
	}
	
	
	void execute() {
		System.out.println("실행결과: " + this.avg());
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
}
