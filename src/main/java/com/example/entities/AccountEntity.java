package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AccountEntity {
	@Id
	@GeneratedValue
	private long id;
/*
	private String foreName;
	private String familyName;
	*/
	private String accNumber;
	
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	/*
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
	*/
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", foreName=" +  ", familyName=" +", accNumber="
				+ accNumber + "]";
	}
	
	
	
	
	



}
