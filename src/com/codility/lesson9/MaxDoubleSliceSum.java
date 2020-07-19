package com.codility.lesson9;

import java.util.Arrays;

public class MaxDoubleSliceSum {

	public int solution(int[] A) {		
		if(A.length <= 3)
			return 0;
		
		int[] start = new int[A.length];
		int[] end = new int[A.length];
		
		int maxSum = 0;
		for(int i=1; i<A.length-1; i++) {
			maxSum = Math.max(0, A[i] + maxSum);
			end[i] = maxSum;
		}
		
		maxSum = 0;
		for(int i=A.length-2; i>0; i--) {
			maxSum = Math.max(0, A[i] + maxSum);
			start[i] = maxSum;
		}
		
		System.out.println("array => " + Arrays.toString(A));
		System.out.println("start => " + Arrays.toString(start));
		System.out.println("end   => " + Arrays.toString(end));
		
		int maxDoubleSliceSum = 0;
		for(int Y=1; Y<A.length-1; Y++)
			maxDoubleSliceSum = Math.max(maxDoubleSliceSum, end[Y-1] + start[Y+1]);
		
		return maxDoubleSliceSum;		
	}
	
	public static void main(String[] args) {
		int[] A = {3, 2, 6, -1, 4, -5, -1, 2};
		//int[] A = {0, 10, -15, 7, 4, 0};
		System.out.println(new MaxDoubleSliceSum().solution(A));
	}
}

