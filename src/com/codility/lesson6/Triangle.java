package com.codility.lesson6;

import java.util.Arrays;

public class Triangle {
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
        int k = A.length;
        Arrays.sort(A);
        
        for(int i=0;i<k-2;i++) {
            if(Long.valueOf(A[i])+Long.valueOf(A[i+1])>Long.valueOf(A[i+2]) && Long.valueOf(A[i+1])+Long.valueOf(A[i+2])>Long.valueOf(A[i]) && Long.valueOf(A[i])+Long.valueOf(A[i+2])>Long.valueOf(A[i+1])) return 1;
        }
        return 0;
    }
	public static void main(String[] args) {
		int[] A = {10,2,5,1,8,20};
		System.out.println(solution(A));
	}
}
