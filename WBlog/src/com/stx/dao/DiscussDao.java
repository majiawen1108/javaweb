package com.stx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.stx.entity.Discuss;

public class DiscussDao extends BaseDao{

	public static List<Discuss> selectAllContent(int blog_id){
		List<Discuss> list=new ArrayList<Discuss>();
	
	Connection con = null;
	PreparedStatement psmt = null;
	
	
	try {
		con=getCon();
		
		String sql="select user_id,content,create_at from t_comment where blog_id=? order by create_at desc";
		psmt =con.prepareStatement(sql);
		psmt.setInt(1,blog_id);
		
		ResultSet rs=psmt.executeQuery();
		Discuss dis=null;
		while(rs.next()) {
			dis=new Discuss();
			dis.setBlog_id(rs.getInt("user_id"));
			dis.setContent(rs.getString("content"));
			dis.setCreate_at(rs.getString("create_at"));
			
			list.add(dis);
		}
		rs.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		closeCon(con,psmt);
	}
	return list;
	}
	public static int saveComment(String Content, int userid ,int blogid) {

		int i = 0;

		Connection con = null;
		PreparedStatement psmt = null;
		try {
			// 1.建立连接
			con = getCon();

			// 2.创建语句
			String sql = "insert into t_comment(user_id,content,blog_id) values(?,?,?);";
			psmt = con.prepareStatement(sql);
			// 设定参数替换？
			psmt.setInt(1, userid);
			psmt.setString(2, Content);
			psmt.setInt(3, blogid);

			// 3.执行语句
			i = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeCon(con, psmt);
		}

		return i;
	}
}
