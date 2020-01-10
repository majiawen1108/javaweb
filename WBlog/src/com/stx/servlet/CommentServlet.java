package com.stx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.dao.DiscussDao;
import com.stx.entity.TUser;

@WebServlet("/comment.do")
public class CommentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String content=req.getParameter("content");
		String blogid=req.getParameter("blogId");
		TUser user = (TUser)req.getSession().getAttribute("user");
		int userId = user.getUserId();
		int blogId1=Integer.parseInt(blogid);
		int i=DiscussDao.saveComment(content, userId, blogId1);
		resp.sendRedirect("home.do");
	}
}
