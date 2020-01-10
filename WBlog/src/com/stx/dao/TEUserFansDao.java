package com.stx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.stx.entity.TUser;

public class TEUserFansDao extends BaseDao {

	public static int saveForFan(TUser user, String dUserId) {
		int i = 0;

		Connection con = null;
		PreparedStatement psmt = null;

		try {
			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "insert into user_fans(s_user_id,d_user_id) values(?,?)";
			psmt = con.prepareStatement(sql);
			// 设定参数，替换问号
			psmt.setInt(1, user.getUserId());
			psmt.setString(2, dUserId);

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

}
