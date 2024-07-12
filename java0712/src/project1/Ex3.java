package project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		
		ArrayList<Member> memberArray = new ArrayList<>();
		
		memberArray.add(new Member("강하나", "002142", "123-1234-1234", 0));
		memberArray.add(new Member("김하나", "001212", "123-1234-1235", 0));
		memberArray.add(new Member("이하나", "001111", "123-1234-1236", 0));
		
		/*
		Member[] list = {
				new Member("강하나", "002142", "123-1234-1234", 0),
				new Member("김하나", "001212", "123-1234-1235", 0),
				new Member("이하나", "001111", "123-1234-1236", 0),
		};
		*/
		try (FileOutputStream fos = new FileOutputStream("c:\\Temp\\members.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(memberArray);
			System.out.println("객체를 파일에 저장했습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
