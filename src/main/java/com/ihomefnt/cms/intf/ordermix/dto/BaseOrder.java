package com.ihomefnt.cms.intf.ordermix.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 硬装订单关联的软装订单和硬装订单基础类
 * 
 * @author chong
 *
 */
public class BaseOrder {
	// 主键
	@PrimaryKey
	private Long id;
	// 全品家订单id
	@ForeginKey
	private Long orderMixId;
	// 合同额
	private BigDecimal contractAmount;
	// 应收金额
	private BigDecimal payingMoney;
	// 待确认收款金额
	private BigDecimal confirmingMoney;
	// 已确认收款金额
	private BigDecimal confirmedMoney;
	// 状态
	private Integer status;
	// 订单类型（1:全品家软装订单,2:软装订单）
	private Integer orderType;
	// 创建时间
	private Timestamp createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderMixId() {
		return orderMixId;
	}

	public void setOrderMixId(Long orderMixId) {
		this.orderMixId = orderMixId;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getPayingMoney() {
		return payingMoney;
	}

	public void setPayingMoney(BigDecimal payingMoney) {
		this.payingMoney = payingMoney;
	}

	public BigDecimal getConfirmingMoney() {
		return confirmingMoney;
	}

	public void setConfirmingMoney(BigDecimal confirmingMoney) {
		this.confirmingMoney = confirmingMoney;
	}

	public BigDecimal getConfirmedMoney() {
		return confirmedMoney;
	}

	public void setConfirmedMoney(BigDecimal confirmedMoney) {
		this.confirmedMoney = confirmedMoney;
	}

}
