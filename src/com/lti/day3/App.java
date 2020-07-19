package com.lti.day3;

public class App {
	public static void main(String[] args) {
		Address ad1 = new Address();
		ad1.setCity("Ajmer");
		ad1.setPincode(305001);
		
		Address ad2 = new Address("Bijainagar", 305624);
		
		Shop shop1 = new Shop(ad1, "250", 123456);
		
		Flat flat1 = new Flat(ad2, "400", "1BHK");
		
		Flat flat2 = new Flat();
		flat2.setAddress(ad2);
		flat2.setArea("500");
		flat2.setType("2BHK");
		
	}
}
