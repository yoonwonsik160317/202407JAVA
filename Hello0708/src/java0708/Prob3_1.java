package java0708;

import java.util.Scanner;

public class Prob3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1, str2;
		int in1 = 0;
		int in2 = 0;
		int result = 0;
		
		for (;;) {
			System.out.print("숫자 1을 입력: ");
			str1 = scan.nextLine();
			
			System.out.print("숫자 2을 입력: ");
			str2 = scan.nextLine();
			
			in1 = Integer.parseInt(str1);
			in2 = Integer.parseInt(str2);
			
			if (in1>in2) {
				result = in1;
			} else if(in2 > in1) {
				result = in2;
			} else {
				result = 0;
			}
			
			System.out.println(result);
		}
	}
}
