package com.tianyu.pojo;

import java.sql.Date;

public class ShoppingCart {

	private int shoppingCartId;
	
	private int userId;
	
	private int productId;
	
	private int productNumber;
	
	private int productMoney;
	
	private Date shoppingCartTime;

	

	public int getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(int shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
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

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public int getProductMoney() {
		return productMoney;
	}

	public void setProductMoney(int productMoney) {
		this.productMoney = productMoney;
	}

	public Date getShoppingCartTime() {
		return shoppingCartTime;
	}

	public void setShoppingCartTime(Date shoppingCartTime) {
		this.shoppingCartTime = shoppingCartTime;
	}
	
	
}
