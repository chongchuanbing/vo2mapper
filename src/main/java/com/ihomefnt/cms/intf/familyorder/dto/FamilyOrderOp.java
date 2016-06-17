package com.ihomefnt.cms.intf.familyorder.dto;

import java.sql.Timestamp;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 全品家操作记录
 * @author chong
 *
 */
public class FamilyOrderOp {
	// 主键
	@PrimaryKey
	private Long id;
	// 订单id
	@ForeginKey
	private Long orderId;
	// json字符串
	private String operationJson;
	// 创建时间
	private Timestamp createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOperationJson() {
		return operationJson;
	}

	public void setOperationJson(String operationJson) {
		this.operationJson = operationJson;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}
