package com.stx.entity;

import java.util.List;

/**
 * 
 * @author 马家文 
 * 跟数据表博文表对应的实体类
 */
public class TBlog {

	private int blogId;
	private String blogContent;
	private int thumb;
	private int userId;
	private String username;
	private String createAt;
	private String updateAt;
	private List<Discuss> discussList;
	//作者信息，直接封装成一个对象
	private TUser author;
	

	public List<Discuss> getDiscussList() {
		return discussList;
	}
	public void setDiscussList(List<Discuss> discussList) {
		this.discussList = discussList;
	}
	public TBlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TBlog(int blogId, String blogContent, int thumb, int userId, String username, String createAt,
			String updateAt) {
		super();
		this.blogId = blogId;
		this.blogContent = blogContent;
		this.thumb = thumb;
		this.userId = userId;
		this.username = username;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}
	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public int getThumb() {
		return thumb;
	}

	public void setThumb(int thumb) {
		this.thumb = thumb;
	}

	public String getUsername() {
		return username;
	}			

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public TUser getAuthor() {
		return author;
	}
	public void setAuthor(TUser author) {
		this.author = author;
	}

	
	

}
