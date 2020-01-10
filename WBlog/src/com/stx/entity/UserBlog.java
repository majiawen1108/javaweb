package com.stx.entity;

import java.util.List;

public class UserBlog {

	private TUser user;
	private List<TBlog> blogList;
	// 0未关注  1是已关注 2互相关注
	private int isFriend;

	public UserBlog() {
		super();
	}

	public int getIsFriend() {
		return isFriend;
	}

	public void setIsFriend(int isFriend) {
		this.isFriend = isFriend;
	}

	public UserBlog(TUser user, List<TBlog> blogList, int isFriend) {
		super();
		this.user = user;
		this.blogList = blogList;
		this.isFriend = isFriend;
	}

	public UserBlog(TUser user, List<TBlog> blogList) {
		super();
		this.user = user;
		this.blogList = blogList;
	}

	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}

	public List<TBlog> getBlogList() {
		return blogList;
	}

	public void setBlogList(List<TBlog> blogList) {
		this.blogList = blogList;
	}

	@Override
	public String toString() {
		return "UserBlog [user=" + user + ", blogList=" + blogList + ", isFriend=" + isFriend + "]";
	}
}
