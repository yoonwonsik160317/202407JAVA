package java0711;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("수를 입력하시오 : ");
			x = scan.nextInt();
		} while (x <10 || x >99);
		
		System.out.println(x);
	}

}
