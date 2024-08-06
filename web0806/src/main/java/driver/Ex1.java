package driver;

import java.util.List;

import dept.DeptDao;
import dept.DeptDto;

public class Ex1 {

	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		List<DeptDto> list = dao.getDeptList();
		for (DeptDto dto : list) {
			System.out.println(dto);
		}

	}

}
