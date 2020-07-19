package com.codility.lesson5;

import java.util.Arrays;

public class SumPrefix {
	
	private static void solution(int[] a, int x, int y) {
		int k = a.length;
		int[] count = new int[k+1];
		int sum = 0;
		
		System.out.println(Arrays.toString(count));
		for(int i=1;i<count.length;i++) {
			count[i] = count[i-1] +a[i-1];
		}
		System.out.println(Arrays.toString(count));
		
		sum = count[y+1] - count[x];		//count[6] - count[2]
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		int[] A = {2,8,2,4,3,3,5};
		solution(A, 2, 5);
		
//		int x=999999999;
	}

	
}
