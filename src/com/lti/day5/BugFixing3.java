package com.lti.day5;

import java.util.Arrays;

public class BugFixing3 {

	//check if the array contains every number from 1 to K atleast once
	public boolean solution(int[] A, int K) {
		Arrays.sort(A);
		int n = A.length;
		for (int i = 0; i<n-1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 || A[n - 1] < K)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		int[] A = {8, 3, 2, 1};
		int K = 2;

		System.out.println(new BugFixing3().solution(A, K));
	}
}