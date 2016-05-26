package com.ihomefnt.cms.intf.ordermix.dto;

import java.math.BigDecimal;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 全品家软装订单详细 主要存储软装商品
 * 
 * @author chong
 *
 */
public class SoftOrderDetail {
	// 主键
	@PrimaryKey
	private Long id;
	// 订单id
	@ForeginKey
	private Long orderId;
	// 商品id
	@ForeginKey
	private Long productId;
	// 产品数量
	private BigDecimal productAmount;
	// 备注
	private String remark;
	// 是否是样品(1:是样品;2:不是样品)
	private Integer isSample;

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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public BigDecimal getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(BigDecimal productAmount) {
		this.productAmount = productAmount;
	}

	public Integer getIsSample() {
		return isSample;
	}

	public void setIsSample(Integer isSample) {
		this.isSample = isSample;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
