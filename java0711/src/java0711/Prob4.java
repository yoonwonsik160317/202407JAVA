package java0711;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int n;

		System.out.println("수를 입력하시오 : ");
		
		do {
			System.out.print("n 값 : ");
			n = scan.nextInt();
		} while (n<=0);
		
		for (int i = 1; i <= n; i++) {
			
			if (i <=n-1) {
				System.out.print(i+"+");
				
			}else if(i == n) {
				System.out.print(i+"=");
			}
			sum += i;
		}

		System.out.println(sum);
		
	}

}
