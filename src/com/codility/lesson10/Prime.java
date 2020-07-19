package com.codility.lesson10;

public class Prime {
	public static void main(String[] args) {
		int n=4;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
