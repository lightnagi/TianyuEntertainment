package com.tianyu.pojo;

import java.sql.Date;

public class ShoppingRecord {

	private int shoppingRecordId;
	
	private int userId;
	
	private int productId;
	
	private int completeMoney;
	
	private Date completeTime;

	public int getShoppingRecordId() {
		return shoppingRecordId;
	}

	public void setShoppingRecordId(int shoppingRecordId) {
		this.shoppingRecordId = shoppingRecordId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCompleteMoney() {
		return completeMoney;
	}

	public void setCompleteMoney(int completeMoney) {
		this.completeMoney = completeMoney;
	}

	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	
	
}
