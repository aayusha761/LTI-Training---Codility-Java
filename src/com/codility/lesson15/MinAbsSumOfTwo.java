package com.codility.lesson15;

import java.util.Arrays;

public class MinAbsSumOfTwo {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        long sum = Integer.MAX_VALUE;
        int front = 0;
//        int back = 0;
        for(int back=0;back<A.length;back++) {
        	long temp = A[front] + A[back];
        	while(front < A.length) {
        		sum = Math.min(temp, sum);
        		front++;
        	}
        	
        }
        return (int)sum;
    }
	public static void main(String[] args) {
		int[] A = {1, 4, -3};
		int[] B = {-8, 4, 5, -10, 3};
		
//		System.out.println(solution(A));
		System.out.println(solution(B));
	}
}
