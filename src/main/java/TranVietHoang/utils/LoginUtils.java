package TranVietHoang.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import TranVietHoang.beans.UserAccount;

public class LoginUtils {
	public static UserAccount findUser(Connection conn,String userName,String password) throws SQLException  {
		String sql = "Select a.USER_NAME , a.PASSWORD, a.GENDER from USER_ACCOUNT a" + "where a.USER_NAME = ? and a.PASSWORD = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			String gender = rs.getString("GENDER");
			UserAccount user = new UserAccount();
			user.setUser_name(userName);
			user.setGender(gender);
			user.setPassword(password);
			return user;
		}
		return null;
	}
	
	public static UserAccount findUser(Connection conn,String userName) throws SQLException  {
		String sql = "Select a.USER_NAME , a.PASSWORD, a.GENDER from USER_ACCOUNT a" + "where a.USER_NAME = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			String gender = rs.getString("Gender");
			String password = rs.getString("Password");
			UserAccount user = new UserAccount();
			user.setUser_name(userName);
			user.setGender(gender);
			user.setPassword(password);
			return user;
		}
		return null;
	}
}
