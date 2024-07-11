package java0711;

import java.util.Scanner;

public class Prob5_1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("수를 입력하시오 : ");
			n = scan.nextInt();
		} while (n <=0);
		
		for (int i = 0; i< n/2; i++) {
			System.out.print("");
		}
	}

}
