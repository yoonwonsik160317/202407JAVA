package java0711;

import java.util.Scanner;	

public class Prob1 {
	
	public static int med(int a, int b, int c) {
		
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if((a > b && c<b) || (a<b && c>b)) {
			return b;
		}
		return c;
	}
		/*
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if( a <= c){
				return a;
			} else {
				return c;
			}
		} else if(a > c) {
			return a;
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	*/
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다");
		System.out.print("a 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println(med(a, b, c));
		
	}

}
