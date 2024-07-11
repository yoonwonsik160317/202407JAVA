package java0711;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		String id = "java";
		int pw = 12345;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int input = scanner.nextInt();
			
			switch (input) {
				case 1:
					System.out.println("로그인 처리");
					System.out.print("아이디 : ");
					String inputId = scanner.next();
					System.out.print("패스워드 : ");
					int inputPw = scanner.nextInt();
				
					if ((inputId.equals(id))&&(inputPw == pw)) {
					System.out.println("로그인 성공");
					} else {
					System.out.println("로그인 정보가 잘못 되었습니다.");
					}
					break;
					
				case 2:
					System.out.println("회원가입");
					System.out.println("[필수 정보 입력]");
					
					System.out.print("1. 이름 : ");
					String inputName  = scanner.next();
					
					System.out.print("2. 주민번호 앞 6자리 : ");
					String inputNum = scanner.next();
					
					System.out.print("3. 전화번호 : ");
					String inputTel = scanner.next();
					
					System.out.println("[입력된 내용]");
					System.out.println("1. 이름 : "+inputName);
					System.out.println("2. 주민번호 앞 6자리 : "+ inputNum);
					System.out.println("3. 전화번호 : "+inputTel);
					break;
					
				case 3:
					System.out.println("예금 / 출금");
					while(run) {
						
						System.out.println("-----------------------------");
						System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
						System.out.println("-----------------------------");
						System.out.print("선택> ");
						int input1 = scanner.nextInt();
						
						if(input1 == 1) {
							
							System.out.print("예금액> ");
							int in1 = scanner.nextInt();
							balance = in1;
						} else if(input1 == 2) {
							System.out.printf("출금액> ");
							int in = scanner.nextInt();
							balance = balance - in;
						} else if(input1 == 3) {
							System.out.printf("잔고> %d\n",balance);
						} else if(input1 ==4){
							System.out.println("예금 / 출금 종료");
							break;
						} else {
							System.out.println("잘못된 입력입니다");
						}	
					}
					break;
					
				case 4:
					System.out.println("프로그램 전체 종료");
					run = false;
					break;
			}
			
			
		}
		
	}

}
