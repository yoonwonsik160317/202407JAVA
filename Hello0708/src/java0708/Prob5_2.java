package java0708;

import java.util.Scanner;

public class Prob5_2 {

	public static void main(String[] args) {

		
Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : (score >= 50) ? "E" : "F";
		
		System.out.println(grade);
	}

}
