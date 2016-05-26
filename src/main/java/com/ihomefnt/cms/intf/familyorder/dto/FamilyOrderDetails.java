package com.ihomefnt.cms.intf.familyorder.dto;

import java.math.BigDecimal;

import com.vo2mapper.annotation.FieldSearch;
import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 订单关联商品明细
 * 
 * @author chong
 *
 */
public class FamilyOrderDetails {
	// 主键
	@PrimaryKey
	private Long id;
	// 全品家订单id
	@ForeginKey
	@FieldSearch
	private Long orderId;
	// 产品id
	@ForeginKey
	private Long productId;
	// 产品数量
	private BigDecimal productAmount;
	// 产品价格
	private BigDecimal productPrice;
	// 产品总价=产品价格*产品数量
	private BigDecimal productPriceAmount;
	// 备注
	private String remark;
	// 状态 1:有效,2:无效
	private Integer status;
	// 物流状态 0未送货 1已出库 2已收货
	private Integer deliveryStatus;
	// 已发货数量
	private BigDecimal deliverGoodsAmount;
	// 空间id
	private Long roomId;
	// 套装id
	private Long suitId;
	// 是否是样品, 1 : 是样品； 0 ： 不是样品
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

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public BigDecimal getProductPriceAmount() {
		return productPriceAmount;
	}

	public void setProductPriceAmount(BigDecimal productPriceAmount) {
		this.productPriceAmount = productPriceAmount;
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

	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public BigDecimal getDeliverGoodsAmount() {
		return deliverGoodsAmount;
	}

	public void setDeliverGoodsAmount(BigDecimal deliverGoodsAmount) {
		this.deliverGoodsAmount = deliverGoodsAmount;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getSuitId() {
		return suitId;
	}

	public void setSuitId(Long suitId) {
		this.suitId = suitId;
	}

	public Integer getIsSample() {
		return isSample;
	}

	public void setIsSample(Integer isSample) {
		this.isSample = isSample;
	}

}
