package com.codility.lesson17;

import java.util.Arrays;

public class NumberSolitaire {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] dp = new int[A.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = A[0];
        
        for(int i=0;i<A.length;i++) {
            for(int j=1;j<=6;j++) {
                if(i+j < A.length) {
                    dp[i+j] = Math.max(dp[i+j], dp[i] + A[i+j]);
                }
                else break;
            }
        }
        
        return dp[A.length - 1];
    }
	public static void main(String[] args) {
		int[] A = {1,-2,0,9,-1,-2};
		solution(A);
	}
}
