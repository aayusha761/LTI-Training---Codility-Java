package com.lti.day3;

public class Property {
	private Address address;	//has-a relationship
	private String area;
	
	public Property(Address address, String area) {
		super();
		this.address = address;
		this.area = area;
	}
	
	public Property() {
		
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
}
