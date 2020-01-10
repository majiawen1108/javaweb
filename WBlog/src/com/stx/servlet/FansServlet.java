package com.stx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.dao.TEUserFansDao;
import com.stx.entity.TUser;

@WebServlet("/fans.do")
public class FansServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 获取Session中的登录用户信息
		TUser user = (TUser) req.getSession().getAttribute("user");
		if (user == null) {
			resp.sendRedirect("login.do");
			return;
		}
		//获取对方的ID
		String dUserId = req.getParameter("dUserId");
		
		//插入数据
		int retVal = TEUserFansDao.saveForFan(user,dUserId); 
		
		//重定向回主页
		resp.sendRedirect("index.do");
	}
}
