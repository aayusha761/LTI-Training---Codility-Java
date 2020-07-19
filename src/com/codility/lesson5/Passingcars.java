package com.codility.lesson5;

import java.util.Arrays;

public class Passingcars {
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int k = A.length;
        
        int[] count = new int[k+1];
        
        for(int i=1;i<count.length;i++) {
            count[i] = count[i-1] + A[i-1];
    // 		if(count[i]>1000000000) return -1;

        }
        
		System.out.println(Arrays.toString(count));

		int sum=0;
		for(int i=0;i<A.length;i++) {
		    if(A[i] == 0) {
		        sum = sum + (count[k] - count[i]);
        		if(sum>1000000000) return -1;
		    }
		}
		return sum;
    }
	
	public static void main(String[] args) {
		int[] A = {1,1,1,1,0};
		System.out.println("result : "+solution(A));
	}
}
