package com.lti.day2;

public class ExploreLibrary {
	public static void main(String[] args) {
		scenario1();
	}
	
	public static void scenario1() {
		int x=65;
		//display the value of x in binary, octal and hexadecimal form
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toOctalString(x));

//		System.out.println(getRandom(1, 10));
		System.out.println(Math.sqrt(64));
		
		int rno = (int) Math.ceil(Math.random()*10);
		System.out.println(rno);
	}
//	public static int getRandom(int min, int max) {
//		return (int) (Math.random()*(max-min) + min);
//	}
	
	//how much memory was allocated to the java program... How much is free now and maximum limit of RAM we can use
}
