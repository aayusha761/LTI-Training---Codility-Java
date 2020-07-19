package com.lti.challenge;

import java.util.Arrays;

public class CoinChange {
	
	private static int[] solution(int[] C, int k) {
		// TODO Auto-generated method stub
		int n = C.length;
		int[] dp = new int[k + 1];
		for (int i = 1; i <= k; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = C[i - 1]; j < k + 1; j++) {
				dp[j] = Math.min(dp[j - C[i - 1]] + 1, dp[j]);
			}
		}
		
		System.out.println(Arrays.toString(dp));
		return dp;
	}
	
	private static int[][] solution1(int[] C, int k) {
		// TODO Auto-generated method stub
		int n = C.length;
		int[][] dp = new int[n+1][k + 1];
		
		
		for(int i=1;i<n+1;i++) {
			dp[0][i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1;i<n+1;i++) {
			for(int j = 0;j < C[i-1];j++) {
				dp[i][j] = dp[i-1][j];
			}
			for(int j=C[i-1];j<k+1;j++) {
				dp[i][j] = Math.min(dp[i][j-C[i-1]]+1, dp[i-1][j]);
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp;
		
	}
	
	public static void main(String[] args) {
		int[] C = {1,2,5};
		int k = 12;
		
		System.out.println(solution(C,k));
		System.out.println(solution1(C,k));
	}
}
