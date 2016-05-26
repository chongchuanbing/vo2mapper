package com.ihomefnt.cms.intf.ordermix.dto;

import java.sql.Timestamp;

/**
 * 全品家拆分的软装
 * @author chong
 *
 */
public class SoftOrder extends BaseOrder{
	//预计送货时间
	private Timestamp estimatTime;

	public Timestamp getEstimatTime() {
		return estimatTime;
	}

	public void setEstimatTime(Timestamp estimatTime) {
		this.estimatTime = estimatTime;
	}
	
}
