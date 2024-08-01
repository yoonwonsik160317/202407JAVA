package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class AccountDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String ACCOUNT_LIST = "select * from account";
	private String ACCOUNT_ONE = "select * from account where id = ?";
	private String ACCOUNT_INSERT = "insert into account(name, ssn, tel, balance) values(?,?,?,?)";
	private String ACCOUNT_COUNT = "select count(*) as cnt from account where name = ? and ssn = ?";
	
	//로그인 확인
	public boolean checkLogin(String name, String ssn) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(ACCOUNT_COUNT);
			pstmt.setString(1, name);
			pstmt.setString(2, ssn);
			rs = pstmt.executeQuery();
			rs.next();
			if(rs.getInt("cnt") == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return false;
	}
	
	//account 등록
	public void insertAccount(AccountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(ACCOUNT_INSERT);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSsn());
			pstmt.setString(3, dto.getTel());
			pstmt.setInt(4, dto.getBalance());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	//account 1건 조회
	public AccountDTO getOne(int id) {
		AccountDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(ACCOUNT_ONE);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new AccountDTO(
						rs.getInt("id"), rs.getString("name"),
						rs.getString("ssn"), rs.getString("tel"), 
						rs.getInt("balance"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return dto;
	}
	
	//account 다중 조회
	public List<AccountDTO> getAccountList() {
		List<AccountDTO>list = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(ACCOUNT_LIST);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AccountDTO dto = new AccountDTO(
						rs.getInt("id"), rs.getString("name"),
						rs.getString("ssn"), rs.getString("tel"), 
						rs.getInt("balance"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return list;
	}

}
