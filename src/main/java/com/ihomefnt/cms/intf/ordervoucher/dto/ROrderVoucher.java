package com.ihomefnt.cms.intf.ordervoucher.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 订单和抵用券关联表
 * 
 * @author chong
 *
 */
public class ROrderVoucher {
	// 主键
	private Long id;
	// 订单id
	private Long orderId;
	// 抵用券id
	private Long voucherId;
	// 抵用金额
	private BigDecimal amountOfMoney;
	// 订单类型(目前硬装还没有抵用券,扩展备用 1:软装;2：硬装;3:全品家软装;4:全品家硬装)
	private Integer orderType;
	// 状态
	private String status;
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

	public Long getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(Long voucherId) {
		this.voucherId = voucherId;
	}

	public BigDecimal getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(BigDecimal amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}