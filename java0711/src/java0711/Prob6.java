package java0711;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int w;
		do {
			System.out.println("n을 입력하시오 : ");
			n = scan.nextInt();
			System.out.println("w을 입력하시오 : ");
			w = scan.nextInt();
		} while (n <=0 || (w > n || w <=0));
		
		for (int i = 1; i<=n; i++) {
			System.out.print("*");
			if (i%w == 0) {
				System.out.print("\n");
			}

		}

	}

}
