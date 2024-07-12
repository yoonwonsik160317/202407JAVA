package java0712;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int num = Integer.parseInt(scan.nextLine());
		double array[][] = new double[num][3];
		
		for (int i=0; i<array.length; i++) {
			System.out.println(i+"번 째 학생");
			int sum = 0;
			for (int j=0; j<array[i].length; ++j) {
				
				if(j==array[i].length-1) {
					int avg = sum/(array[i].length-1);
					array[i][j] = avg;
					break;
				}
				array[i][j] = Integer.parseInt(scan.nextLine());
				sum += array[i][j];
			}
		}
		for (int i = 0; i<array.length; i++) {
			System.out.println(i+"번 째 학생");
			for(int j = 0; j<array[i].length; j++) {
					System.out.printf("%f  ",array[i][j] );
			}
			System.out.println();

		}

	}

}
