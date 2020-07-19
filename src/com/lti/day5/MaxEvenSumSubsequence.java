package com.lti.day5;

public class MaxEvenSumSubsequence {
	
	private static int solution(int[] a) {
		
		int sumPositive = 0;
		int sumTotal = 0;
		int maxSum = 0;
		int maxEvenSumPossible = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) sumPositive +=a[i];
		}
		//sum positive numbers
		if(sumPositive %2 == 0) {
			maxEvenSumPossible = sumPositive;
		}
		
		for(int i=0;i<a.length;i++) {
			sumTotal +=a[i];
		}
		
		if(sumTotal > maxEvenSumPossible && sumTotal%2 == 0) {
			maxSum = sumTotal;
		}
		
		else maxSum = maxEvenSumPossible;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if((sum+a[i])%2 == 0) {
				sum = sum + a[i];
			}
		}
		
		if(sum > maxSum) maxSum = sum;
		return maxSum;
	}
	public static void main(String[] args) {
		int[] A = {-2, 2, -3, 1, 3};
		int[] B = {-7, 2, -3,1};
		System.out.println(solution(A));
		System.out.println(solution(B));
	}
}
