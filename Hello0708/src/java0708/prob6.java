package java0708;

import java.util.Scanner;
public class prob6 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int input = scan.nextInt();
	
		if(input >= 0 )
			System.out.printf("%d", input);
		else if(input < 0){
			input = input * -1;
			System.out.printf("%d", input);
			
		}
	}
}
