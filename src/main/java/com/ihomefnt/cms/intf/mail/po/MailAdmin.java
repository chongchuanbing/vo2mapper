/*
 * Copyright (C) 2014-2016 AiJia All rights reserved
 * Author: chong
 * Date: 2016年10月29日
 * Description:MailAdmin.java 
 */
package com.ihomefnt.cms.intf.mail.po;

import java.util.Date;

/**
 * @author chong
 */
public class MailAdmin {
	// 主键
	private Integer id;

	// 人员id
	private Integer adminId;

	// 状态
	private Integer status;

	// 创建时间
	private Date createTime;

	// 更新时间
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
