package com.ihomefnt.cms.intf.receiver.dto;

/**
 * 收货信息
 * 
 * @author chong
 *
 */
public class Receiver {
	// 主键
	private Long id;
	// 收货人姓名
	private String receiver;
	// 手机号
	private String mobile;
	// 区域id
	private Long areaId;
	// 房屋小区
	private String houseArea;
	// 楼栋号
	private String houseNo;
	// 房号
	private String roomNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

}
