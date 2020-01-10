package com.stx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.stx.entity.TBlog;
import com.stx.entity.TUser;

public class TBlogDao extends BaseDao{

	public static List<TBlog> selectAllBlog(TUser user) {
		List<TBlog> list = new ArrayList<TBlog>();

		Connection con = null;
		PreparedStatement psmt = null;

		try {
			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "select blog_id,blog_content,b.create_at,b.user_id,username,thumb from t_blog b left join t_user u on u.user_id=b.user_id where b.user_id=?";
			psmt = con.prepareStatement(sql);
			//替换？
			psmt.setInt(1, user.getUserId());
			
			
			// 执行语句
			ResultSet rs = psmt.executeQuery();
			TBlog blog = null;
			TUser author = null;
			while(rs.next()) {
				// 创建对象，使用查询出的数据对对象进行装配
				blog = new TBlog();
				author  =new TUser();
				blog.setBlogId(rs.getInt("blog_id"));
				blog.setBlogContent(rs.getString("blog_content"));
				blog.setCreateAt(rs.getString("create_at"));
				blog.setUserId(rs.getInt("user_id"));
				blog.setUsername(rs.getString("username"));
				blog.setThumb(rs.getInt("thumb"));
				
				author.setUserId(rs.getInt("user_id"));
				
				//将作者绑定到博文对象中
				blog.setAuthor(author);
				list.add(blog);
			}
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeCon(con, psmt);
		}
		// 返回放数据的容器
		return list;
	}

	public static int saveBlog(String blogContent, TUser user) {
		
		int i = 0;
		
		Connection con = null;
		PreparedStatement psmt = null;

		try {
			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "insert into t_blog(blog_content,user_id) values(?,?)";
			psmt = con.prepareStatement(sql);
			// 设定参数，替换问号
			psmt.setString(1,blogContent);
			psmt.setInt(2, user.getUserId());

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
	
	public static int addThumb(String blogId) {
		
		int i=0;
	
		Connection con = null;
		PreparedStatement psmt = null;

		try {

			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "update t_blog set thumb=thumb+1 where blog_id = ?";
			psmt = con.prepareStatement(sql);
			// 替换？
			
			psmt.setString(1, blogId);

			// 3.执行语句
			 i = psmt.executeUpdate();

			// 4.处理结果
			

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			closeCon(con,psmt);
		}
		return i;
}

	public static void dropBlogById(String blogId, TUser user) {
		Connection con = null;
		PreparedStatement psmt = null;

		try {

			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "delete from t_blog where blog_id = ? and user_id = ?";
			psmt = con.prepareStatement(sql);
			// 替换？
			
			psmt.setString(1, blogId);
			psmt.setInt(2, user.getUserId());

			// 3.执行语句
			psmt.executeUpdate();

			// 4.处理结果
			

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			closeCon(con,psmt);
		}
	}

	public static int insertComment(int userId, int blogId, String comment) {
		Connection con = null;
		PreparedStatement psmt = null;

		try {
			// 1.建立连接
			con = getCon();

			// 2.创建语句
			String sql = "insert into t_comment(user_id, blog_id, comment) values(?,?,?)";
			psmt = con.prepareStatement(sql);
			// 设定参数，替换？
			psmt.setInt(1, userId);
			psmt.setInt(2, blogId);
			psmt.setString(3, comment);

			// 3.执行语句
			int i = psmt.executeUpdate();

			// 4.处理结果
			return i;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5.释放资源
			closeCon(con, psmt);
		}
		return 0;
	}

	public static TBlog selBlogByPrimaryKey(int blogId) {
		Connection con = null;
		PreparedStatement psmt = null;
		TBlog blog = null;

		try {
			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "select * from t_blog where blog_id = ?";
			psmt = con.prepareStatement(sql);
			// 替换问号
			psmt.setInt(1, blogId);

			// 3.执行语句
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				// 创建对象，使用查询出的数据对对象进行装配
				blog = new TBlog();
				blog.setBlogId(rs.getInt("blog_id"));
				blog.setBlogContent(rs.getString("blog_content"));
				blog.setCreateAt(rs.getString("create_at"));
				blog.setUserId(rs.getInt("user_id"));
				blog.setThumb(rs.getInt("thumb"));
			}
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			closeCon(con, psmt);
		}
		// 返回放数据的容器
		return blog;
	}

	public static List<TBlog> selectAllBlog(int loginUserId) {
		List<TBlog> list = new ArrayList<TBlog>();

		Connection con = null;
		PreparedStatement psmt = null;

		try {
			// 1.建立连接
			con = getCon();
			// 2.创建语句
			String sql = "select blog_id,blog_content,fans_id,s_user_id,d_user_id,b.create_at,b.user_id,username,thumb from t_blog b left join t_user u on u.user_id=b.user_id left join user_fans f on u.user_id=f.d_user_id order by create_at desc";
			psmt = con.prepareStatement(sql);
			
			
			
			// 执行语句
			ResultSet rs = psmt.executeQuery();
			TBlog blog = null;
			TUser author = null;
			int sUserId = -1;
			while(rs.next()) {
				author = new TUser();
				// 创建对象，使用查询出的数据对对象进行装配
				blog = new TBlog();
				blog.setBlogId(rs.getInt("blog_id"));
				blog.setBlogContent(rs.getString("blog_content"));
				blog.setCreateAt(rs.getString("create_at"));
				blog.setUserId(rs.getInt("user_id"));
				blog.setUsername(rs.getString("username"));
				blog.setThumb(rs.getInt("thumb"));
				
				//判断当前登录用户是否为博文作者的粉丝
				sUserId = rs.getInt("s_user_id");
				if(sUserId==loginUserId){
					author.setLoginFans(1);
				}
				author.setUserId(rs.getInt("user_id"));
				//将作者绑定到博文对象中
				blog.setAuthor(author);
				list.add(blog);
			}
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeCon(con, psmt);
		}
		// 返回放数据的容器
		return list;
	}

	

	
}
