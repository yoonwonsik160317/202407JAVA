package dp;

public class Main2 {

	public static void main(String[] args) {
		Student minsu = new Student("민수");
		Student chulsu = new Student("철수");
		
		Course java = new Course("cs100", "자바");
		Course cplus = new Course("cs101", "C/C++");
		
		
		chulsu.registerCourse(java);
		
		minsu.registerCourse(java);
		minsu.registerCourse(cplus);
		
		System.out.println(minsu.toString());
		System.out.println(chulsu.toString());
		
		//코스별 신청자 출력
		java.addStudent(minsu);
		java.addStudent(chulsu);
		
		cplus.addStudent(minsu);
		
		System.out.println(java.getStudents());
		System.out.println(cplus.getStudents());

	}

}
