package java0712;

public class Ex03 {

	public static void main(String[] args) {
		int[][] array = {{95, 86}, {83, 92, 93}, {78, 83,93,87,88}};
		
	//	System.out.println(array.length);
	System.out.println(array[1].length);
	//	System.out.println(array[2].length);
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i=0; i< array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count ++;
			}
		}
		
		avg = (double)sum /count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
