package java0712;

import java.util.Scanner;

public class SearchEX2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a[] = {"Hello", "자바", "가나다", "동서울", "스프링"};
		String val ;
		
		
		System.out.print("찾을 문자열:");
		val = scan.nextLine();
		int find = -1;
		
		for (int i=0; i < a.length; i++) {
			if (a[i].equals(val)) {
				find = i;
				break;
			}
		}
		System.out.println("인덱스 : "+find);

	}

}
