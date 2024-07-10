package java0710;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int input = scanner.nextInt();
			
			if(input == 1) {
				
				System.out.print("예금액> ");
				int in1 = scanner.nextInt();
				balance = in1;
			} else if(input == 2) {
				System.out.printf("출금액> ");
				int in = scanner.nextInt();
				balance = balance - in;
			} else if(input == 3) {
				System.out.printf("잔고> %d\n",balance);
			} else if(input ==4){
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못된 입력입니다");
			}
			
		}

	}

}
