package com.ihomefnt.cms.intf.familyorder.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.vo2mapper.annotation.ForeginKey;
import com.vo2mapper.annotation.PrimaryKey;

/**
 * 全品家订单
 * 
 * @author chong
 *
 */
public class FamilyOrder {
	// 主键
	@PrimaryKey
	private Long id;
	// 客户id
	@ForeginKey
	private Long customerId;
	// 楼盘id
	@ForeginKey
	private Long buildingId;
	// 区域id
	@ForeginKey
	private Long areaId;
	// 客户姓名
	private String purchaserName;
	// 客户电话
	private String purchaserTel;
	// 房屋小区
	private String houseAddress;
	// 楼栋号
	private String buildingNo;
	// 房屋号
	private String houseNo;
	// 硬装合同编号
	private String haradOrderNum;
	// 软装合同编号
	private String softOrderNum;
	// 下单时间
	private Timestamp orderTime;
	// 预计送货时间
	private Timestamp expectedDeliveryTime;
	// 硬装金额
	private BigDecimal hardLoadingMoney;
	// 软装金额
	private BigDecimal softLoadingMoney;
	// 抵用券金额
	private BigDecimal voucher;
	// 抵用券id
	@ForeginKey
	private Long voucherId;
	// 现金券金额
	private BigDecimal cashCoupon;
	// 现金券id
	@ForeginKey
	private Long cashCouponId;
	// 硬装应收金额
	private BigDecimal hardLoadingReceivableMoney;
	// 软装应收金额
	private BigDecimal softLoadingReceivableMoney;
	// 硬装定金金额
	private BigDecimal hardLoadingDepositMoney;
	// 软装订单金额
	private BigDecimal softLoadingDepositMoney;
	// 诚意金/定金id
	@ForeginKey
	private Long moneyId;
	// 备注
	private String remark;
	// 修改时间
	private Timestamp modifyTime;
	// 创建时间
	private Timestamp createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getPurchaserName() {
		return purchaserName;
	}

	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	public String getPurchaserTel() {
		return purchaserTel;
	}

	public void setPurchaserTel(String purchaserTel) {
		this.purchaserTel = purchaserTel;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getHaradOrderNum() {
		return haradOrderNum;
	}

	public void setHaradOrderNum(String haradOrderNum) {
		this.haradOrderNum = haradOrderNum;
	}

	public String getSoftOrderNum() {
		return softOrderNum;
	}

	public void setSoftOrderNum(String softOrderNum) {
		this.softOrderNum = softOrderNum;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Timestamp getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}

	public void setExpectedDeliveryTime(Timestamp expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}

	public BigDecimal getHardLoadingMoney() {
		return hardLoadingMoney;
	}

	public void setHardLoadingMoney(BigDecimal hardLoadingMoney) {
		this.hardLoadingMoney = hardLoadingMoney;
	}

	public BigDecimal getSoftLoadingMoney() {
		return softLoadingMoney;
	}

	public void setSoftLoadingMoney(BigDecimal softLoadingMoney) {
		this.softLoadingMoney = softLoadingMoney;
	}

	public BigDecimal getVoucher() {
		return voucher;
	}

	public void setVoucher(BigDecimal voucher) {
		this.voucher = voucher;
	}

	public Long getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(Long voucherId) {
		this.voucherId = voucherId;
	}

	public BigDecimal getCashCoupon() {
		return cashCoupon;
	}

	public void setCashCoupon(BigDecimal cashCoupon) {
		this.cashCoupon = cashCoupon;
	}

	public Long getCashCouponId() {
		return cashCouponId;
	}

	public void setCashCouponId(Long cashCouponId) {
		this.cashCouponId = cashCouponId;
	}

	public BigDecimal getHardLoadingReceivableMoney() {
		return hardLoadingReceivableMoney;
	}

	public void setHardLoadingReceivableMoney(BigDecimal hardLoadingReceivableMoney) {
		this.hardLoadingReceivableMoney = hardLoadingReceivableMoney;
	}

	public BigDecimal getSoftLoadingReceivableMoney() {
		return softLoadingReceivableMoney;
	}

	public void setSoftLoadingReceivableMoney(BigDecimal softLoadingReceivableMoney) {
		this.softLoadingReceivableMoney = softLoadingReceivableMoney;
	}

	public BigDecimal getHardLoadingDepositMoney() {
		return hardLoadingDepositMoney;
	}

	public void setHardLoadingDepositMoney(BigDecimal hardLoadingDepositMoney) {
		this.hardLoadingDepositMoney = hardLoadingDepositMoney;
	}

	public BigDecimal getSoftLoadingDepositMoney() {
		return softLoadingDepositMoney;
	}

	public void setSoftLoadingDepositMoney(BigDecimal softLoadingDepositMoney) {
		this.softLoadingDepositMoney = softLoadingDepositMoney;
	}

	public Long getMoneyId() {
		return moneyId;
	}

	public void setMoneyId(Long moneyId) {
		this.moneyId = moneyId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}
