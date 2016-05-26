package com.ihomefnt.cms.intf.user.dto;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;


public class User {
	@PrimaryKey
	private Long id;
	@ForeginKey
	private Long addressId;
	private String userName;
	private Integer userSax;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserSax() {
		return userSax;
	}
	public void setUserSax(Integer userSax) {
		this.userSax = userSax;
	}
	
}
