package com.lti.challenge;

import java.util.Arrays;

public class Fibo {
	public static void main(String[] args) {
		int N = 11;
		int[] fib = new int[N+1];
		Arrays.fill(fib, -1);
		fibonacciDP(N, fib);
		System.out.println(Arrays.toString(fib));
	}
	private static int fibonacciDP(int N, int[] fib) {
		if(N <= 1) 
			return fib[N]=N;
		if(fib[N-1] != -1)
			return fib[N] = fib[N-1]+fib[N-2];
		return fib[N]=fibonacciDP(N-1, fib) + fibonacciDP(N-2, fib);
	}
}
