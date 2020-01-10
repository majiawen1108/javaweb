package com.stx.entity;

import java.util.Date;

public class TEUerFans {

	private int fansId;
	private int sUserId;
	private int dUserId;

	private Date createAt;

	public int getFansId() {
		return fansId;
	}

	public void setFansId(int fansId) {
		this.fansId = fansId;
	}

	public int getsUserId() {
		return sUserId;
	}

	public void setsUserId(int sUserId) {
		this.sUserId = sUserId;
	}

	public int getdUserId() {
		return dUserId;
	}

	public void setdUserId(int dUserId) {
		this.dUserId = dUserId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
