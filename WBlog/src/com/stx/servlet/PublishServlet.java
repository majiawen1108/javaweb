package com.stx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.dao.TBlogDao;
import com.stx.entity.TUser;

@WebServlet("/publish.do")
public class PublishServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");*/
		
		//获取当前用户登录信息
		TUser user =(TUser)req.getSession().getAttribute("user");
		if(user==null){
			//用户未登录，重定向登陆页面
			resp.sendRedirect("login.do");
			return;
		}
		
		
		//接收数据，发表博文
		String blogContent = req.getParameter("blogContent");
		//对博文内容格式进行检查
		
	
		int i = TBlogDao.saveBlog(blogContent,user);
		//发布成功，重定向返回主页
		
		resp.sendRedirect("home.do");
	
	}
	
}
