package java0730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ken", 100));
		list.add(new Student("Park", 60));
		list.add(new Student("Kim", 90));
		
		Collections.sort(list, (s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()));
		System.out.println(list);
		
		list.stream().forEach(s -> {
			System.out.println(s.getName() + ", " + s.getScore());
		});
	}
}
