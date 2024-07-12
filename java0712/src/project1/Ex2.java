package project1;

public class Ex2 {

	public static void main(String[] args) {
		Member mb = null;
		Member[] list = {
				new Member("강하나", "002142", "123-1234-1234", 0),
				new Member("김하나", "001212", "123-1234-1235", 0),
				new Member("이하나", "001111", "123-1234-1236", 0),
				
		};
		for (Member member : list) {
			System.out.println(member);
		}
		int find = -1;
		
		for (int i=0; i<list.length; i++) {
			if(list[i].name.equals("김하나")) {
				find = i;
				mb = list[i];
				break;
			}
		}
		System.out.println("인덱스 :"+find);
		System.out.println(mb);

	}

}
