package java0712;

public class BubbleEx {
	
	public static void printArr(int a[]) {
		
		for (int n : a) {  // for-each, 향상된 for 문
			System.out.print(n+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int a[] = {10, 3, 1, 4, 2};
		int temp = 0;
		
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=a.length-1; j > i; j--) {
				if (a[j] < a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					System.out.print("\t교환(j-1="+(j-1)+", j="+j+")");
					printArr(a);
				}
			}
			printArr(a);
		}
	//	for (int i=0; i < a.length; i++) {
	//		System.out.print(a[i]+", ");
	//	}
			System.out.println();
		
	}

}
