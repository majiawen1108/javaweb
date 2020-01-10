package com.stx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.dao.TUserDao;
import com.stx.entity.TUser;

@WebServlet("/zhuce.do")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//引导用户进入页面
		req.getRequestDispatcher("/WEB-INF/page/register.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String username = req.getParameter("username");
		if(username==null || username.trim().length()==0){
			req.setAttribute("msg", "请输入用户名");
			req.getRequestDispatcher("/WEB-INF/page/register.jsp").forward(req, resp);
			return;
		}else if(!username.matches("^\\d{3,}$")){
			req.setAttribute("msg", "用户名至少为三个数字");
			req.getRequestDispatcher("/WEB-INF/page/register.jsp").forward(req, resp);
			return;
		}
	
		
		String passcode = req.getParameter("passcode");
		if(passcode==null || passcode.trim().length()==0){
			req.setAttribute("msg", "请输入密码");
			req.getRequestDispatcher("/WEB-INF/page/register.jsp").forward(req, resp);
			return;
		}else if(!passcode.matches("^\\d{3,}$")){
			req.setAttribute("msg", "密码至少为三个数字");
			req.getRequestDispatcher("/WEB-INF/page/register.jsp").forward(req, resp);
			return;
		}
		
		TUser user = new TUser();
		user.setUsername(username);
		user.setPasscode(passcode);
		
		int i = TUserDao.saveUser(username,passcode,user);
		
	
		resp.sendRedirect("login.do");
	}
}
