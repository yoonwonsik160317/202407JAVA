package java0711;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int big, small;
		int sum = 0;
		
		System.out.println("두 정수를 입력하시오 : ");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		
		if(i1>=i2) {
			big = i1;
			small = i2;
		} else {
			big = i2;
			small = i1;
		}
		
		for (int i =small; i<=big; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
