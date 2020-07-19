package com.lti.day3;

public class Flat extends Property {	//is a relationship
	private String type;

	public Flat() {
		// TODO Auto-generated constructor stub
	}
	public Flat(Address address, String area, String type) {
		super(address, area);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}