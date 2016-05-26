package com.ihomefnt.cms.intf.ordermix.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.vo2mapper.annotation.ForeginKey;

/**
 * 全品家操作历史
 * 
 * @author chong
 *
 */
public class OrderMixOp {
	// 主键
	@ForeginKey
	private Long id;
	// 订单id
	@ForeginKey
	private Long orderMixId;
	// 款项进度id
	@ForeginKey
	private Long paymentSchedulerId;
	// 操作类型
	private Integer operation;
	// 操作类型对应的字符串
	private String operationStr;
	// 金额
	private BigDecimal amountOfMoney;
	// 款项类型 TYPEPAYMENT_HO
	private Integer payType;
	// 款项类型字符串
	private String payTypeStr;
	// 支付方式(现金支付；POS机支付；网划)
	private Integer payment;
	// 收款编号
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

	public Long getOrderMixId() {
		return orderMixId;
	}

	public void setOrderMixId(Long orderMixId) {
		this.orderMixId = orderMixId;
	}

	public Long getPaymentSchedulerId() {
		return paymentSchedulerId;
	}

	public void setPaymentSchedulerId(Long paymentSchedulerId) {
		this.paymentSchedulerId = paymentSchedulerId;
	}

	public Integer getOperation() {
		return operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
	}

	public String getOperationStr() {
		return operationStr;
	}

	public void setOperationStr(String operationStr) {
		this.operationStr = operationStr;
	}

	public BigDecimal getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(BigDecimal amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public String getPayTypeStr() {
		return payTypeStr;
	}

	public void setPayTypeStr(String payTypeStr) {
		this.payTypeStr = payTypeStr;
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
