package com.stx.servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.dao.TBlogDao;
import com.stx.dao.DiscussDao;
import com.stx.entity.TBlog;
import com.stx.entity.Discuss;
import com.stx.entity.TUser;

@WebServlet("/index.do")
public class IndexServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");*/
		
		//从Session中获取用户信息
		TUser user =(TUser)req.getSession().getAttribute("user");
		if(user==null){
			//用户未登录，请回登录页面
			resp.sendRedirect("login.do"); 
		}
		
		//访问数据库获取所有的博文信息
		List<TBlog> blogList = TBlogDao.selectAllBlog(user.getUserId());	
		
		for (TBlog tBlog : blogList) {
			int blogId = tBlog.getBlogId();
			List<Discuss> discussList=DiscussDao.selectAllContent(blogId);
			tBlog.setDiscussList(discussList);
		}
		//将数据绑定到请求对象中
		req.setAttribute("list", blogList);
		
		req.getRequestDispatcher("/WEB-INF/page/index.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
