package java0729;

public class Ex3 {

	public static void main(String[] args) {
		String str = "이것은 자바 대치 예제입니다.";
		String newstr = str.replace("예제", "코드");
		System.out.println(str);
		System.out.println(newstr);
		if(str == newstr) {
			System.out.println("같은 저장소");
		} else {
			System.out.println("다른 저장소");
		}
	}
}