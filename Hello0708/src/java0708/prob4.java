package java0708;

import java.util.Scanner;

public class prob4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int input = scan.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int input2 = scan.nextInt();

		System.out.print("세 번째 수 입력 : ");
		int input3 = scan.nextInt();
		
		int max = input;
		
		if (input2 > max)
			max = input2;
		if (input3 > max)
			max = input3;
		
		System.out.printf("가장 큰 수는 %d 입니다 ", max	);
		
	}
	
}
