package project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Myproject1 {

	public static void main(String[] args) {
		Member nowMember = null;
		ArrayList<Member> memberList = null;
		
		try (FileInputStream fis = new FileInputStream("c:\\Temp\\members.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
					memberList =  (ArrayList<Member>) ois.readObject();
					System.out.println("파일에서 객체를 가져왔습니다");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("------------------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.회원 조회 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int input = scanner.nextInt();
			
			switch (input) {
				case 1:
					System.out.println("로그인 처리");
					System.out.print("아이디 : ");
					String name = scanner.next();
					System.out.print("패스워드 : ");
					String ssnPassword = scanner.next();
					boolean x = false;
					for (Member find:memberList) {
						if(find.name.equals(name)&&(find.ssn.equals(ssnPassword))) {
							System.out.println("로그인 성공");
							System.out.println(find);
							nowMember = find;
							x = false;
							break;
						} else {
							x = true;
						}
					
					}
					if(x) {
						System.out.println("로그인 실패");
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
					//객체 생성
					memberList.add(new Member(inputName, inputNum, inputTel, 0));
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
							int in = scanner.nextInt();
							nowMember.balance += in;
						} 
						else if(input1 == 2) {
							System.out.printf("출금액> ");
							int out = scanner.nextInt();
							nowMember.balance -= out;
						} 
						else if(input1 == 3) {
							System.out.printf("잔고> %d\n",nowMember.balance);
						} 
						else if(input1 ==4){
							System.out.println("예금 / 출금 종료");
							break;
						} 
						else {
							System.out.println("잘못된 입력입니다");
						}	
					}
					break;
					
				case 4:
					for(Member member : memberList)
						System.out.printf("이름: "+member.name+", 주민 번호 앞자리: " + member.ssn+", 전화번호: "+member.phone+", 잔고: %d\n", member.balance);
					break;
					
				case 5:
					System.out.println("프로그램 전체 종료");
					run = false;
					break;
			}
			
			
		}
		
	}

}
