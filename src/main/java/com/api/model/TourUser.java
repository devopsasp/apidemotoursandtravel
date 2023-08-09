package com.api.model;

import jakarta.persistence.*;

@Entity
public class TourUser {
	
	@Id
	private int userId;
	private String userName;
	private String emailId;
	private String address;
	private String prefferedPaymentMode;
	private String mobile;
	
	
	
	
	public TourUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TourUser(int userId, String userName, String emailId, String address, String prefferedPaymentMode,
			String mobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.address = address;
		this.prefferedPaymentMode = prefferedPaymentMode;
		this.mobile = mobile;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrefferedPaymentMode() {
		return prefferedPaymentMode;
	}
	public void setPrefferedPaymentMode(String prefferedPaymentMode) {
		this.prefferedPaymentMode = prefferedPaymentMode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
  	
	

}
