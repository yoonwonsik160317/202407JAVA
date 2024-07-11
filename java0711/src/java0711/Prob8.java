package java0711;

public class Prob8 {

	public static void main(String[] args) {

		int scores[] = {83, 90, 87};
		int sum = 0;
		double avg = 0;
		
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		avg = (double)sum/scores.length;
		System.out.println(avg);
		System.out.println(sum);
	}

}
