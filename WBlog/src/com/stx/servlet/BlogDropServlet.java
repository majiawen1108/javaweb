package com.stx.servlet;

import com.stx.dao.TBlogDao;
import com.stx.entity.TUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/blog-drop.do")
public class BlogDropServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//获取用户提交的博文ID。
		String blogId = req.getParameter("blogId");
		
		//数据校验
		
		//从session中获取用户信息
		TUser user = (TUser) req.getSession().getAttribute("user");
		if (user==null){
			resp.sendRedirect("login.do");
			return;
		}
		
		//根据Dao类将该条博文删除
		TBlogDao.dropBlogById(blogId,user);
		
		//删除博文结束后哦重定向回主页
		resp.sendRedirect("home.do");
		
	}
}
