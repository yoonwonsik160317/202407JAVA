package java0730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ken", 100));
		list.add(new Student("Park", 60));
		list.add(new Student("Kim", 90));

/*
		for (Student st : list) {
			String msg = MessageFormat.format("{0}, {1}", st.getScore());
			System.out.println(msg);
		}
		*/
		
		list.stream()
		.forEach(a -> {
			String msg = MessageFormat.format("{0}, {1}", a.getName(), a.getScore());
			System.out.println(msg);
		});
		
		list.stream()
		.filter(s -> s.getScore() >= 70)
		.forEach(s -> System.out.println(s.getName()));
		
		long num = list.stream().filter(s -> s.getScore() >= 70).count();
		System.out.println("70점 이상은 " + num + "명");
	}
}
