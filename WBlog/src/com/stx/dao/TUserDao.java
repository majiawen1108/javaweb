package com.stx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;
import com.stx.entity.TUser;

public class TUserDao extends BaseDao {

	public static TUser getUser(String username, String passcode) {
		// TODO Auto-generated method stub
		TUser user =null;

		Connection con = null;
		PreparedStatement psmt = null;

		try {
			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "select user_id,username from t_user where username=?and passcode = ?";
			psmt = con.prepareStatement(sql);
			//替换？
			psmt.setString(1, username);
			psmt.setString(2, passcode);
			
			
			// 执行语句
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				// 创建对象，使用查询出的数据对对象进行装配
				user = new TUser();
				user.setUserId(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
			}
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeCon(con, psmt);
		}
		// 返回放数据的容器
		return user;
		
	}
	


public static int saveUser(String username, String passcode, TUser user) {
	int i = 0;
	
	Connection con = null;
	PreparedStatement psmt = null;

	try {
		// 1.建立连接
		con = getCon();
		// 2.创建语句
		String sql = "insert into t_user(username,passcode) values(?,?)";
		psmt = con.prepareStatement(sql);
		// 设定参数，替换问号
		psmt.setString(1,username);
		psmt.setString(2, passcode);

		// 执行语句
		i = psmt.executeUpdate();

		// 处理结果
		System.out.println(i);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		closeCon(con, psmt);
	}
	
	return i;
}

/**
 * 根据用户id查询用户
 * @param userId
 * @return
 */
public static TUser getUser(int userId) {
	TUser user = null;
	Connection con = null;
	PreparedStatement psmt = null;

	try {
		// 1.建立连接
		con = getCon();
		// 2.创建语句
		String sql = "select * from t_user where user_id=?";
		psmt = con.prepareStatement(sql);
		// 替换问号
		psmt.setInt(1, userId);
		// 3.执行语句
		ResultSet rs = psmt.executeQuery();

		if (rs.next()) {
			// 创建对象，使用查询出的数据对对象进行装配
			user = new TUser();
			user.setUserId(userId);
			user.setUsername(rs.getString("username"));
		}
		rs.close();

	} catch (SQLException e) {

		e.printStackTrace();
	} finally {
		closeCon(con, psmt);
	}
	// 返回放数据的容器
	return user;
}



public static List<TUser> selAllUser() {
	TUser user = null;
	Connection con = null;
	Statement st = null;
	List<TUser> userList = new ArrayList<>();

	try {
		// 1.建立连接
		con = getCon();
		// 2.创建语句
		String sql = "select * from t_user";
		st = (Statement) con.createStatement();
		// 3.执行语句
		ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);
		while (rs.next()) {
			user = new TUser();

			user.setUserId(rs.getInt("user_id"));
			user.setUsername(rs.getString("username"));

			userList.add(user);
		}
		rs.close();

	} catch (SQLException e) {

		e.printStackTrace();
	} finally {
		try {
			if (con != null) {
				con.close();
			}
			if (st != null) {
				((Connection) st).close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 返回放数据的容器
	return userList;
}


}
