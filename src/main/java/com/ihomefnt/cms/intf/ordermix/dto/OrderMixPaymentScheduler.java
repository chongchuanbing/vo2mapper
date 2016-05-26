package com.ihomefnt.cms.intf.ordermix.dto;

import java.sql.Timestamp;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 全品家收款记录
 * 
 * @author chong
 *
 */
public class OrderMixPaymentScheduler {
	@PrimaryKey
	private Long id;
	// 全品家订单id
	@ForeginKey
	private Long orderMixId;
	// 金额类型(HardOrderConstant.TYPEPAYMENT_HO)
	private Integer type;
	// 支付方式(现金支付；POS机支付；网划)
	private Integer payment;
	// 收据编号
	private String paymentNo;
	// 如果是POS机支付，还需要存储一个编码
	private String posCode;
	// 备注
	private String remark;
	// 操作人id
	private Integer user;
	// 操作人中文名
	private String userCN;
	// 创建时间
	private Timestamp createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getOrderMixId() {
		return orderMixId;
	}

	public void setOrderMixId(Long orderMixId) {
		this.orderMixId = orderMixId;
	}

	public Integer getPayment() {
		return payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
	}

	public String getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getPosCode() {
		return posCode;
	}

	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getUserCN() {
		return userCN;
	}

	public void setUserCN(String userCN) {
		this.userCN = userCN;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}
