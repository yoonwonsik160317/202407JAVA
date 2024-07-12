package java0712;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기 : ");
		int num = Integer.parseInt(scan.nextLine());
		int array[] = new int[num];
		
		for (int i= 0; i<num; i++) {
			System.out.print(i+ "번째 값: ");
			array[i] = Integer.parseInt(scan.nextLine());
		}
		for (int n: array) {
			System.out.println(n);
		}

	}

}
