package com.qa.example.entities;

public class Account{
	
	private long id;

	private String foreName;
	private String familyName;
	private String accNumber;
	
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getForeName() {
		return foreName;
	}
	public void setForeName(String foreName) {
		this.foreName = foreName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", foreName=" +  ", familyName=" +", accNumber="
				+ accNumber + "]";
	}
	
	public Account(long id, String foreName, String familyName, String accNumber) {
		super();
		this.id = id;
		this.foreName = foreName;
		this.familyName = familyName;
		this.accNumber = accNumber;
	}
	
	
	
	
	



}
