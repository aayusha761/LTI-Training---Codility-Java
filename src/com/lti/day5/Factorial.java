package com.lti.day5;

public class Factorial {
	public static void main(String[] args) {
		int fact = 1;
		int n=5;
		for(int i=1;i<(n+1);i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}