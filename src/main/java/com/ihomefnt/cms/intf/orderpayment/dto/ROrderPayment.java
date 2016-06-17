package com.ihomefnt.cms.intf.orderpayment.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 全品家（软装订单，硬装订单）关联诚意金/定金
 * 
 * @author chong
 *
 */
public class ROrderPayment {
	// 主键
	private Long id;
	// 全品家（软装订单，硬装订单）id
	private Long orderId;
	// 诚意金/定金id
	private Long moneyId;
	// 金额
	private BigDecimal mountOfMoney;
	// 区分诚意金/定金(1:诚意金;2:定金)
	private Integer moneyType;
	// 状态
	private Integer status;
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

	public Long getMoneyId() {
		return moneyId;
	}

	public void setMoneyId(Long moneyId) {
		this.moneyId = moneyId;
	}

	public BigDecimal getMountOfMoney() {
		return mountOfMoney;
	}

	public void setMountOfMoney(BigDecimal mountOfMoney) {
		this.mountOfMoney = mountOfMoney;
	}

	public Integer getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(Integer moneyType) {
		this.moneyType = moneyType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}
