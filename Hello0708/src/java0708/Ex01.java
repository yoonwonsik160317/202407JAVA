package java0708;

public class Ex01 {

	public static void swap (int a, int b) {
		int temp = a;
		
		a = b;
		b = temp;
		System.out.printf("swap 함수를 사용해서 바꾸기 x : %d, y : %d", a, b);
	}
 static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.printf("바꾸기 전 x, y 값 x : %d, y : %d\n", x, y);
	
		temp =x ;
		x= y;
		y = temp;
		
		System.out.printf("바꾼 후 x, y 값 x : %d, y ; %d	", x, y);
		System.out.println("\n-------------------------------\n");
		
		swap(x, y);
	
	}
}

