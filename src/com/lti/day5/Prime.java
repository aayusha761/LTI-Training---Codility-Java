package com.lti.day5;

public class Prime {
	static boolean prime(long num) {
		
		if(num == 1) return false;
		for(long j=2;j<=Math.sqrt(num);j++) {
			if(num%j == 0) {
				return false;
			}
		}
		return true;
	}
	
	static void displayPrime(long k) {
		long count = 0;
		
		for(long num=2;num<k*k;num++) {
			if(prime(num) && count<k) {
				System.out.println(num);
				count++;
				System.out.println("count : "+count);

			}
		}
		
	}
	
	public static void main(String[] args) {
//		System.out.println(prime(15485849));
		displayPrime(1000000);
	}
}