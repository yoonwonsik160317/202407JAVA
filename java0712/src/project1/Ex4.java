package project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		ArrayList<Member> memberList = null;
		
		try (FileInputStream fis = new FileInputStream("c:\\Temp\\members.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			memberList =  (ArrayList<Member>) ois.readObject();
			System.out.println("파일에서 객체를 가져왔습니다");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : memberList) {
			System.out.println(member);
		}
		System.out.println(memberList.get(0).name);

	}

}
