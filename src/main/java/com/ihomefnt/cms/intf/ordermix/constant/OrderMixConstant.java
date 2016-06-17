package com.ihomefnt.cms.intf.ordermix.constant;

/**
 * 全品家常量
 * @author chong
 *
 */
public class OrderMixConstant {
	/**
	 * 用于款项进度类型
	 * @author chong
	 *
	 */
	public static enum TYPEPAYMENT_HO {
		EARNESTMONEY("诚意金", 1),
		DEPOSITMONEY("定金", 2),
		BEFORE_PAY("首付款", 3),
		AFTER_PAY("尾款", 4),
		BACK_PAY("退款", 5);
		
        private String name;
        private int index;

        private TYPEPAYMENT_HO(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public static String getName(int index) {
            for (TYPEPAYMENT_HO c : TYPEPAYMENT_HO.values()) {
                if (c.getIndex() == index) {
                    return c.name;
                }
            }
            return null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
	}
	
	/**
	 * 订单来源
	 * @author chong
	 *
	 */
	public static enum ORIGINAL_HO {
		ONLINE("线上", 1), 
		OFFLINE("线下", 2);
		
        private String name;
        private int index;

        private ORIGINAL_HO(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public static String getName(int index) {
            for (ORIGINAL_HO c : ORIGINAL_HO.values()) {
                if (c.getIndex() == index) {
                    return c.name;
                }
            }
            return null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
	}
}
