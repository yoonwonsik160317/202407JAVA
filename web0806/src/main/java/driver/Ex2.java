package driver;

import dept.DeptDao;
import dept.DeptDto;

public class Ex2 {

	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		DeptDto dto = new DeptDto(50, "영업", "서울");
		dao.insertDept(dto);
		System.out.println("입력 성공");

	}

}
