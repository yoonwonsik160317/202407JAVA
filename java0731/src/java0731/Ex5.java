package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김길동", Member.FEMALE, 20),
				new Member("박길동", Member.FEMALE, 45),
				new Member("최길동", Member.MALE, 37)
				);
		//전체 평균 나이
		double avg = list.stream().mapToInt(a -> a.getAge()).average().orElse(0);
		System.out.println(avg);
		
		//납자 평균 나이
		double avg1 = list.stream()
				.filter(x -> x.getSex() == Member.MALE) // 남자만 필터링(filter는 true, false로 나오게 하면 된다
				.mapToInt(a -> a.getAge())
				.average().orElse(0);//orElse(0)null값을 피하기 위한 방법
		System.out.println(avg1);
	}

}
