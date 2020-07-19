package com.lti.day3;

public class Shop extends Property {	//is a relationship
	private int licenseNo;

	public Shop(Address address, String area, int licenseNo) {
		super(address, area);
		this.licenseNo = licenseNo;
	}
	
	public int getLicenseNo() {
		return licenseNo;
	}
	
	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}
		
		
}
