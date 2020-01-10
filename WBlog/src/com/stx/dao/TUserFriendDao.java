package com.stx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.stx.entity.TUser;

public class TUserFriendDao extends BaseDao{

	/**
	 * 查询用户所有关注列表
	 * 
	 * @param userId
	 * @return
	 */
	public static List<TUser> selAllFriend(int userId) {
		Connection con = null;
		PreparedStatement pstm = null;
		// 返回的集合，把查到的所有已关注的用户放在这个集合中
		List<TUser> userList = new ArrayList<>();
		TUser user = new TUser();

		try {
			// 1.建立连接：
			con = getCon();

			// 2.创建语句，查询到此用户已关注的用户id,注意这里查到的是用户id
			String url = "SELECT des_user_id FROM t_user_friend WHERE src_user_id=?";

			// 3.预编译
			pstm = con.prepareStatement(url);
			// 替换问号
			pstm.setInt(1, userId);

			// 4.返回结果集
			ResultSet resultSet = pstm.executeQuery();

			// 5.处理结果集
			while (resultSet.next()) {
				// 获取到结果集中的id
				int userIdTemp = resultSet.getInt("des_user_id");
				// 新建的一个方法，根据id查询用户，这里用到了重载，参数不同，
				user = TUserDao.getUser(userIdTemp);
				// 添加到集合中
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeCon(con, pstm);
		}
		return userList;
	}

	/**
	 * 判断是否关注
	 * 
	 * @param userId
	 * @param friendId
	 * @return
	 */
	public static int judgeIsFriend(int userId, int friendId) {
		Connection con = null;
		PreparedStatement pstm = null;
		PreparedStatement pstm2 = null;

		try {
			// 1.建立连接：
			con = getCon();

			// 2.创建语句
			String sql = "SELECT * FROM t_user_friend WHERE src_user_id = ? " + "AND des_user_id = ? ";

			// 3.预编译
			pstm = con.prepareStatement(sql);
			pstm2 = con.prepareStatement(sql);
			// 替换问号
			pstm.setInt(1, userId);
			pstm.setInt(2, friendId);
			pstm2.setInt(1, friendId);
			pstm2.setInt(2, userId);

			// 4.返回结果集
			ResultSet resultSet = pstm.executeQuery();
			ResultSet resultSet2 = pstm2.executeQuery();

			// 5.处理结果集,如果查询到，则证明已经关注
			if (resultSet.next()) {
				// 如果sql2也执行通过，则说明互相关注
				if (resultSet2.next()) {
					return 2;
				}
				// 否则是单向关注
				return 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeCon(con, pstm);
		}

		return 0;
	}

	/**
	 * 关注用户
	 * @param userId 
	 * @param friendId
	 * @return
	 */
	public static int insertFriend(int userId, int friendId) {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			// 1.建立连接：
			con = getCon();

			// 2.创建语句
			String url = "INSERT INTO t_user_friend(src_user_id, des_user_id) VALUES(?, ?)";

			// 3.预编译
			pstm = con.prepareStatement(url);
			// 替换问号
			pstm.setInt(1, userId);
			pstm.setInt(2, friendId);

			// 4.执行插入
			int i = pstm.executeUpdate();

			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeCon(con, pstm);
		}
		return 0;
	}

	/**
	 * 取消关注
	 * @param userId
	 * @param friendId
	 * @return
	 */
	public static int delFriend(int userId, int friendId) {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			// 1.建立连接：
			con = getCon();

			// 2.创建语句
			String url = "delete from t_user_friend where src_user_id = ? and des_user_id = ?";

			// 3.预编译
			pstm = con.prepareStatement(url);
			// 替换问号
			pstm.setInt(1, userId);
			pstm.setInt(2, friendId);

			// 4.执行插入
			int i = pstm.executeUpdate();

			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeCon(con, pstm);
		}
		return 0;
	}
}
