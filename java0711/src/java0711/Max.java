package java0711;

public class Max {

	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 12};
		int max = 0;
		
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
