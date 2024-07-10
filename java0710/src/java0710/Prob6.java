package java0710;
import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int input = scan.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input*i);
		}
	}

}
