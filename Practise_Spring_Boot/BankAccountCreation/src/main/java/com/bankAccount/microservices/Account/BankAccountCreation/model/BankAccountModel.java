package com.bankAccount.microservices.Account.BankAccountCreation.model;

public class BankAccountModel {
	
	
	private String acctName;
	private long UID;
	private String address;
	
	public BankAccoutModel(String acctName,long UID,String address) {
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getUID() {
		return UID;
	}
	public void setUID(long uID) {
		UID = uID;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	
	

}
