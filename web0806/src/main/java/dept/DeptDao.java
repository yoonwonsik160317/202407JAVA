package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.ant.FindLeaksTask;

import util.JDBCUtil;

public class DeptDao {
	
	private Connection conn = null;
	private PreparedStatement pstmt= null;
	private ResultSet rs = null;
	
	private String dept_list = "select * from dept";
	private String dept_insert = "insert into dept(deptno, dname, loc) values(?, ?, ?)";

	
	public List<DeptDto> getDeptList() {
		List<DeptDto> list = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(dept_list);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptDto dto = new DeptDto(rs.getInt("deptNo"), rs.getString("dName"), rs.getString("loc"));
				list.add(dto);
			
			}
		} catch (SQLException e	) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return list;
	}
	
	public void insertDept(DeptDto dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(dept_insert);
			pstmt.setInt(1, dto.getDeptNo());
			pstmt.setString(2, dto.getdName());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeQuery();
			
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	} 

}
