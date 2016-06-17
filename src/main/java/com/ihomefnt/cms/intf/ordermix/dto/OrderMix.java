package com.ihomefnt.cms.intf.ordermix.dto;

import java.sql.Timestamp;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 全品家订单
 * 
 * @author chong
 *
 */
public class OrderMix {
	// 主键
	@PrimaryKey
	private Long id;
	// 楼盘id
	@ForeginKey
	private Long buildingId;
	// 客户id
	@ForeginKey
	private Long customerId;
	// 收货信息id
	@ForeginKey
	private Long receiverId;
	// 订单编号
	private String orderNum;
	// 财务属性
	private Integer financeAttr;
	// 来源
	private Integer original;
	// 备注
	private String remark;
	// 状态
	private Integer status;
	// 下单时间
	private Timestamp orderTime;
	// 创建时间
	private Timestamp createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Long receiverId) {
		this.receiverId = receiverId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getFinanceAttr() {
		return financeAttr;
	}

	public void setFinanceAttr(Integer financeAttr) {
		this.financeAttr = financeAttr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getOriginal() {
		return original;
	}

	public void setOriginal(Integer original) {
		this.original = original;
	}

}
