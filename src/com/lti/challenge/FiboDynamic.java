package com.lti.challenge;

import java.util.Arrays;

public class FiboDynamic {
	
	public static int fibo(int n) {
		int temp[]= new int[n+1];
		Arrays.fill(temp, -1);

		if(n==0 || n==1)
			return n;
		
		if(temp[n-1]==-1) {
			temp[n-1]= fibo(n-1);
		}
		if(temp[n-2]==-1) {
			temp[n-2]= fibo(n-2);
		}
		temp[n]= temp[n-1]+temp[n-2];
		
		return temp[n];
		
	}
	public static void main(String[] args) {

		System.out.println(fibo(10));
	}
}
