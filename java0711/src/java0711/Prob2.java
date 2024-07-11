package java0711;

import java.util.Scanner;


public class Prob2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int n;
		int sum = 0;
		
		do {
			System.out.print("n 값 : ");
			 n = scan.nextInt();
		} while (n <= 0);
		
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
