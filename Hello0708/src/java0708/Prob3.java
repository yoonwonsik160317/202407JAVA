package java0708;

import java.util.Scanner;


public class Prob3 {
	
	

	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("첫 번째 수 입력 : ");
	int input = scan.nextInt();
	
	System.out.print("두 번째 수 입력 : ");
	int input2 = scan.nextInt();
	
	if (input > input2) {
		System.out.printf("큰 수는 %d 입니다", input);
	} else if (input < input2) {
		System.out.printf("큰 수는 %d 입니다", input2);
	} else {
		System.out.print("두 수의 크기는 같습니다 0");
	}
		
	}
}
