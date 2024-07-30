package java0730;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		
		//array는 set으로 변경 불가하기 때문에 list으로 먼저 바꾼 후 set으로 변경
		Integer[] arr = new Integer[] {1, 62, 31, 1, 54, 31};
		List<Integer> list3 = Arrays.asList(arr);
		Set<Integer> set3 = new HashSet<Integer>(list3);
		System.out.println(set3);
		
		List<Integer> list = Arrays.asList(1, 62, 31, 1, 54, 31);
		List<String> list2 = Arrays.asList("홍길동", "김길동", "홍길동");
		System.out.println(list);
		System.out.println(list2);
		
		//list를 set으로 바꿈 (증복을 제거하기 위해)
		Set<Integer> set1 = new HashSet<>(list);
		System.out.println(set1);
		Set<String> set2 = new HashSet<>(list2);
		System.out.println(set2);
	}

}
