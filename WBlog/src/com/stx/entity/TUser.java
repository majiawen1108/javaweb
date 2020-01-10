package com.stx.entity;

/**
 * 
 * @author 马家文 跟数据对应的实体类
 */
public class TUser {

	private int userId;
	private String username;
	private String passcode;
	private String createAt;
	private String updateAt;

	//登录用户是否是他的粉丝-1  1
	private int loginFans = -1;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
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

	public int getLoginFans() {
		return loginFans;
	}

	public void setLoginFans(int loginFans) {
		this.loginFans = loginFans;
	}

}
