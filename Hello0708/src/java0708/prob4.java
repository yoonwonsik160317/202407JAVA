package java0708;

import java.util.Scanner;

public class prob4 {
	
	public static int maxNum(int x, int y, int z) {
		
		int max = x;
		
		if (y > max)
			max = y;
		if (z > max)
			max = z;
		
		return max;
	}

	public static void main(String[] args) {
		
		int x, y, z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		x = scan.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		y = scan.nextInt();

		System.out.print("세 번째 수 입력 : ");
		z = scan.nextInt();
		
		
		System.out.printf("가장 큰 수는 %d 입니다 ", maxNum(x, y, z));
		
	}
	
}
